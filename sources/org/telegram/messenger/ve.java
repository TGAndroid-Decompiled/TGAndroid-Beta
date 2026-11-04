package org.telegram.messenger;

import android.app.DownloadManager;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class ve implements cs {
    public c f25853a;
    public org.telegram.ui.ActionBar.s1 f25854b;
    public ArrayList f25855c;
    public HashMap d;
    public float f25856e;
    public boolean f25857f;
    public boolean h;
    public int f25858n;
    public CountDownLatch f25859r;
    public kr f25860s;
    public boolean f25861w;

    public final void a(java.io.File r28, java.io.File r29, java.lang.String r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ve.a(java.io.File, java.io.File, java.lang.String):void");
    }

    public final boolean b(zi ziVar) {
        TLRPC.MessageMedia o12;
        TLRPC.Photo photo;
        TLRPC.PhotoSize w10;
        ?? r22;
        ?? r62;
        boolean z10 = false;
        if (!ziVar.E3() || (o12 = zi.o1(ziVar.f26868k)) == null || (photo = o12.photo) == null || o12.document == null || (w10 = w7.w(photo.sizes, g0.Z0(true), false, null, true)) == null) {
            return false;
        }
        w7.G(this.f25853a.f21919a);
        File K = w7.K(w10, null, false, true);
        File K2 = w7.K(o12.document, null, false, true);
        if (K != null && K.exists()) {
            r22 = 0;
        } else {
            r22 = 1;
        }
        if (K2 != null && K2.exists()) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        int i3 = r22 + r62;
        if (i3 > 0) {
            this.f25859r = new CountDownLatch(i3);
            g0.h3(new dh(this, (boolean) r22, w10, ziVar, o12.photo, (boolean) r62, o12.document));
            this.f25859r.await();
        }
        if (!this.f25857f) {
            if (K == null || !K.exists()) {
                K = w7.K(w10, null, true, true);
            }
            if (K2 == null || !K2.exists()) {
                K2 = w7.K(o12.document, null, true, true);
            }
            if (K != null && K.exists() && K2 != null && K2.exists()) {
                String D = w7.D(K);
                if (TextUtils.isEmpty(D)) {
                    D = "jpg";
                }
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(D.toLowerCase());
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    mimeTypeFromExtension = "image/jpeg";
                }
                String p02 = g0.p0(0, D);
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentValues contentValues = new ContentValues();
                    Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
                    contentValues.put("relative_path", new File(Environment.DIRECTORY_DOWNLOADS, "Telegram") + File.separator);
                    contentValues.put("_display_name", p02);
                    contentValues.put("mime_type", mimeTypeFromExtension);
                    Uri insert = t0.f25457b.getContentResolver().insert(contentUri, contentValues);
                    if (insert != null) {
                        OutputStream openOutputStream = t0.f25457b.getContentResolver().openOutputStream(insert);
                        if (openOutputStream != null) {
                            try {
                                MediaController.H0(K, K2, openOutputStream, null);
                                z10 = !this.f25857f;
                            } catch (Throwable th2) {
                                try {
                                    openOutputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        }
                        if (openOutputStream != null) {
                            openOutputStream.close();
                        }
                        if (z10) {
                            this.f25858n++;
                        } else {
                            try {
                                t0.f25457b.getContentResolver().delete(insert, null, null);
                            } catch (Exception unused) {
                            }
                        }
                    }
                } else {
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Telegram");
                    file.mkdirs();
                    File file2 = new File(file, p02);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        MediaController.H0(K, K2, fileOutputStream, null);
                        fileOutputStream.close();
                        if (this.f25857f) {
                            file2.delete();
                        } else {
                            ((DownloadManager) t0.f25457b.getSystemService("download")).addCompletedDownload(file2.getName(), file2.getName(), false, mimeTypeFromExtension, file2.getAbsolutePath(), file2.length(), true);
                            this.f25858n++;
                        }
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                float size = (100.0f / this.f25855c.size()) + this.f25856e;
                this.f25856e = size;
                g0.h3(new te(this, (int) size, 3));
                return true;
            }
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        HashMap hashMap = this.d;
        if (i3 != hs.Y1 && i3 != hs.Z1) {
            if (i3 == hs.X1 && hashMap.containsKey((String) objArr[0])) {
                g0.h3(new te(this, (int) a1.g.A(((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()), this.f25855c.size(), 100.0f, this.f25856e), 0));
            }
        } else if (hashMap.remove((String) objArr[0]) != null) {
            this.f25859r.countDown();
        }
    }
}
