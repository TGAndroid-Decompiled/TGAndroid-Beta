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
public final class cf implements ls {
    public c f21803a;
    public org.telegram.ui.ActionBar.u1 f21804b;
    public ArrayList f21805c;
    public HashMap d;
    public float f21806e;
    public boolean f21807f;
    public boolean h;
    public int f21808n;
    public CountDownLatch f21809r;
    public sr f21810s;
    public boolean f21811w;

    public final void a(java.io.File r28, java.io.File r29, java.lang.String r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cf.a(java.io.File, java.io.File, java.lang.String):void");
    }

    public final boolean b(ij ijVar) {
        TLRPC.MessageMedia o12;
        TLRPC.Photo photo;
        TLRPC.PhotoSize w10;
        ?? r22;
        ?? r62;
        boolean z9 = false;
        if (!ijVar.E3() || (o12 = ij.o1(ijVar.f23237k)) == null || (photo = o12.photo) == null || o12.document == null || (w10 = w7.w(photo.sizes, g0.Z0(true), false, null, true)) == null) {
            return false;
        }
        w7.G(this.f21803a.f21723a);
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
        int i7 = r22 + r62;
        if (i7 > 0) {
            this.f21809r = new CountDownLatch(i7);
            g0.h3(new mh(this, (boolean) r22, w10, ijVar, o12.photo, (boolean) r62, o12.document));
            this.f21809r.await();
        }
        if (!this.f21807f) {
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
                    Uri insert = t0.f25555b.getContentResolver().insert(contentUri, contentValues);
                    if (insert != null) {
                        OutputStream openOutputStream = t0.f25555b.getContentResolver().openOutputStream(insert);
                        if (openOutputStream != null) {
                            try {
                                MediaController.H0(K, K2, openOutputStream, null);
                                z9 = !this.f21807f;
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
                        if (z9) {
                            this.f21808n++;
                        } else {
                            try {
                                t0.f25555b.getContentResolver().delete(insert, null, null);
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
                        if (this.f21807f) {
                            file2.delete();
                        } else {
                            ((DownloadManager) t0.f25555b.getSystemService("download")).addCompletedDownload(file2.getName(), file2.getName(), false, mimeTypeFromExtension, file2.getAbsolutePath(), file2.length(), true);
                            this.f21808n++;
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
                float size = (100.0f / this.f21805c.size()) + this.f21806e;
                this.f21806e = size;
                g0.h3(new af(this, (int) size, 3));
                return true;
            }
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        HashMap hashMap = this.d;
        if (i7 != qs.Y1 && i7 != qs.Z1) {
            if (i7 == qs.X1 && hashMap.containsKey((String) objArr[0])) {
                g0.h3(new af(this, (int) com.google.android.recaptcha.internal.a.c(((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()), this.f21805c.size(), 100.0f, this.f21806e), 0));
            }
        } else if (hashMap.remove((String) objArr[0]) != null) {
            this.f21809r.countDown();
        }
    }
}
