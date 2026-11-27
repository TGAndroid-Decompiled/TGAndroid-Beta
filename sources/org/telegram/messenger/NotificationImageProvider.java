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
public class NotificationImageProvider extends ContentProvider implements fn7 {
    public static String d;
    public static UriMatcher e;
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public final HashMap c = new HashMap();

    @Override
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.Y1) {
            synchronized (this.b) {
                String str = (String) objArr[0];
                if (this.a.remove(str)) {
                    this.c.remove(str);
                    this.b.notifyAll();
                }
            }
        }
    }

    @Override
    public final String[] getStreamTypes(Uri uri, String str) {
        if (!str.startsWith("*/") && !str.startsWith("image/")) {
            return null;
        }
        return new String[]{"image/jpeg", "image/png", "image/webp"};
    }

    @Override
    public final String getType(Uri uri) {
        return null;
    }

    @Override
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override
    public final boolean onCreate() {
        for (int i = 0; i < yac.c(); i++) {
            jn7.f(i).a(this, jn7.Y1);
        }
        return true;
    }

    @Override
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        long currentTimeMillis;
        if ("r".equals(str)) {
            if (e == null) {
                UriMatcher uriMatcher = new UriMatcher(-1);
                e = uriMatcher;
                String str2 = d;
                if (str2 == null) {
                    a.d();
                    str2 = "org.telegram.messenger.beta.notification_image_provider";
                    d = "org.telegram.messenger.beta.notification_image_provider";
                }
                uriMatcher.addURI(str2, "msg_media_raw/#/*", 1);
            }
            if (e.match(uri) == 1) {
                List<String> pathSegments = uri.getPathSegments();
                Integer.parseInt(pathSegments.get(1));
                String str3 = pathSegments.get(2);
                String queryParameter = uri.getQueryParameter("final_path");
                String queryParameter2 = uri.getQueryParameter("fallback");
                File file = new File(queryParameter);
                a.v();
                if (!hl.G1(Uri.fromFile(file), 0)) {
                    if (!file.exists()) {
                        Long l = (Long) this.c.get(str3);
                        if (l != null) {
                            currentTimeMillis = l.longValue();
                        } else {
                            currentTimeMillis = System.currentTimeMillis();
                        }
                        if (l == null) {
                            this.c.put(str3, Long.valueOf(currentTimeMillis));
                        }
                        while (!file.exists()) {
                            if (System.currentTimeMillis() - currentTimeMillis >= 3000) {
                                if (f11.a) {
                                    cc4.l("Waiting for " + str3 + " to download timed out");
                                }
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    File file2 = new File(queryParameter2);
                                    if (!hl.G1(Uri.fromFile(file2), 0)) {
                                        return ParcelFileDescriptor.open(file2, 268435456);
                                    }
                                    throw new SecurityException("trying to read internal file");
                                }
                                throw new FileNotFoundException("Download timed out");
                            }
                            synchronized (this.b) {
                                this.a.add(str3);
                                try {
                                    this.b.wait(1000L);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                        if (hl.G1(Uri.fromFile(file), 0)) {
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
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override
    public final void shutdown() {
        for (int i = 0; i < yac.c(); i++) {
            jn7.f(i).n(this, jn7.Y1);
        }
    }

    @Override
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
