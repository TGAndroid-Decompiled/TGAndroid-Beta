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
public class NotificationImageProvider extends ContentProvider implements us {
    public static String d;
    public static UriMatcher e;
    public final HashSet f14511a = new HashSet();
    public final Object f14512b = new Object();
    public final HashMap f14513c = new HashMap();

    @Override
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.Y1) {
            synchronized (this.f14512b) {
                try {
                    String str = (String) objArr[0];
                    if (this.f14511a.remove(str)) {
                        this.f14513c.remove(str);
                        this.f14512b.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
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
        for (int i10 = 0; i10 < d20.c(); i10++) {
            zs.f(i10).b(this, zs.Y1);
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
                if (d == null) {
                    w0.d();
                    d = "org.telegram.messenger.beta.notification_image_provider";
                }
                uriMatcher.addURI(d, "msg_media_raw/#/*", 1);
            }
            if (e.match(uri) == 1) {
                List<String> pathSegments = uri.getPathSegments();
                Integer.parseInt(pathSegments.get(1));
                String str2 = pathSegments.get(2);
                String queryParameter = uri.getQueryParameter("final_path");
                String queryParameter2 = uri.getQueryParameter("fallback");
                File file = new File(queryParameter);
                w0.w();
                if (!i0.I1(Uri.fromFile(file), 0)) {
                    if (!file.exists()) {
                        Long l4 = (Long) this.f14513c.get(str2);
                        if (l4 != null) {
                            currentTimeMillis = l4.longValue();
                        } else {
                            currentTimeMillis = System.currentTimeMillis();
                        }
                        if (l4 == null) {
                            this.f14513c.put(str2, Long.valueOf(currentTimeMillis));
                        }
                        while (!file.exists()) {
                            if (System.currentTimeMillis() - currentTimeMillis >= 3000) {
                                if (v2.f18448a) {
                                    f8.l("Waiting for " + str2 + " to download timed out");
                                }
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    File file2 = new File(queryParameter2);
                                    if (!i0.I1(Uri.fromFile(file2), 0)) {
                                        return ParcelFileDescriptor.open(file2, 268435456);
                                    }
                                    throw new SecurityException("trying to read internal file");
                                }
                                throw new FileNotFoundException("Download timed out");
                            }
                            synchronized (this.f14512b) {
                                this.f14511a.add(str2);
                                try {
                                    this.f14512b.wait(1000L);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                        if (i0.I1(Uri.fromFile(file), 0)) {
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
        for (int i10 = 0; i10 < d20.c(); i10++) {
            zs.f(i10).n(this, zs.Y1);
        }
    }

    @Override
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
