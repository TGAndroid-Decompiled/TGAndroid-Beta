package org.telegram.messenger;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
public class NotificationImageProvider extends ContentProvider implements NotificationCenter.NotificationCenterDelegate {
    private static String authority;
    private static UriMatcher matcher;
    private HashSet<String> waitingForFiles = new HashSet<>();
    private final Object sync = new Object();
    private HashMap<String, Long> fileStartTimes = new HashMap<>();

    public static String getAuthority() {
        if (authority == null) {
            authority = ApplicationLoader.getApplicationId() + ".notification_image_provider";
        }
        return authority;
    }

    private static UriMatcher getUriMatcher() {
        if (matcher == null) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            matcher = uriMatcher;
            uriMatcher.addURI(getAuthority(), "msg_media_raw/#/*", 1);
        }
        return matcher;
    }

    @Override
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override
    public void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.fileLoaded) {
            synchronized (this.sync) {
                try {
                    String str = (String) objArr[0];
                    if (this.waitingForFiles.remove(str)) {
                        this.fileStartTimes.remove(str);
                        this.sync.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override
    public String[] getStreamTypes(Uri uri, String str) {
        if (!str.startsWith("*/") && !str.startsWith("image/")) {
            return null;
        }
        return new String[]{"image/jpeg", "image/png", "image/webp"};
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override
    public boolean onCreate() {
        for (int i9 = 0; i9 < UserConfig.getActivatedAccountsCount(); i9++) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileLoaded);
        }
        return true;
    }

    @Override
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        long currentTimeMillis;
        if ("r".equals(str)) {
            if (getUriMatcher().match(uri) == 1) {
                List<String> pathSegments = uri.getPathSegments();
                Integer.parseInt(pathSegments.get(1));
                String str2 = pathSegments.get(2);
                String queryParameter = uri.getQueryParameter("final_path");
                String queryParameter2 = uri.getQueryParameter("fallback");
                File file = new File(queryParameter);
                ApplicationLoader.postInitApplication();
                if (!AndroidUtilities.isInternalUri(Uri.fromFile(file))) {
                    if (!file.exists()) {
                        Long l10 = this.fileStartTimes.get(str2);
                        if (l10 != null) {
                            currentTimeMillis = l10.longValue();
                        } else {
                            currentTimeMillis = System.currentTimeMillis();
                        }
                        if (l10 == null) {
                            this.fileStartTimes.put(str2, Long.valueOf(currentTimeMillis));
                        }
                        while (!file.exists()) {
                            if (System.currentTimeMillis() - currentTimeMillis >= 3000) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.w("Waiting for " + str2 + " to download timed out");
                                }
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    File file2 = new File(queryParameter2);
                                    if (!AndroidUtilities.isInternalUri(Uri.fromFile(file2))) {
                                        return ParcelFileDescriptor.open(file2, 268435456);
                                    }
                                    throw new SecurityException("trying to read internal file");
                                }
                                throw new FileNotFoundException("Download timed out");
                            }
                            synchronized (this.sync) {
                                this.waitingForFiles.add(str2);
                                try {
                                    this.sync.wait(1000L);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                        if (AndroidUtilities.isInternalUri(Uri.fromFile(file))) {
                            throw new SecurityException("trying to read internal file");
                        }
                    }
                    return ParcelFileDescriptor.open(file, 268435456);
                }
                throw new SecurityException("trying to read internal file");
            }
            throw new FileNotFoundException("Invalid URI");
        }
        throw new SecurityException("Can only open files for read");
    }

    @Override
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override
    public void shutdown() {
        for (int i9 = 0; i9 < UserConfig.getActivatedAccountsCount(); i9++) {
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileLoaded);
        }
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
