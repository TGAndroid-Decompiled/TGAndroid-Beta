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
    public c f21842a;
    public org.telegram.ui.ActionBar.u1 f21843b;
    public ArrayList f21844c;
    public HashMap d;
    public float f21845e;
    public boolean f21846f;
    public boolean h;
    public int f21847n;
    public CountDownLatch f21848r;
    public sr f21849s;
    public boolean f21850w;

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
        if (!ijVar.E3() || (o12 = ij.o1(ijVar.f23262k)) == null || (photo = o12.photo) == null || o12.document == null || (w10 = w7.w(photo.sizes, g0.Z0(true), false, null, true)) == null) {
            return false;
        }
        w7.G(this.f21842a.f21765a);
        File J = w7.J(w10, null, false, true);
        File J2 = w7.J(o12.document, null, false, true);
        if (J != null && J.exists()) {
            r22 = 0;
        } else {
            r22 = 1;
        }
        if (J2 != null && J2.exists()) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        int i7 = r22 + r62;
        if (i7 > 0) {
            this.f21848r = new CountDownLatch(i7);
            g0.h3(new mh(this, (boolean) r22, w10, ijVar, o12.photo, (boolean) r62, o12.document));
            this.f21848r.await();
        }
        if (!this.f21846f) {
            if (J == null || !J.exists()) {
                J = w7.J(w10, null, true, true);
            }
            if (J2 == null || !J2.exists()) {
                J2 = w7.J(o12.document, null, true, true);
            }
            if (J != null && J.exists() && J2 != null && J2.exists()) {
                String D = w7.D(J);
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
                    Uri insert = t0.f25566b.getContentResolver().insert(contentUri, contentValues);
                    if (insert != null) {
                        OutputStream openOutputStream = t0.f25566b.getContentResolver().openOutputStream(insert);
                        if (openOutputStream != null) {
                            try {
                                MediaController.H0(J, J2, openOutputStream, null);
                                z9 = !this.f21846f;
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
                            this.f21847n++;
                        } else {
                            try {
                                t0.f25566b.getContentResolver().delete(insert, null, null);
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
                        MediaController.H0(J, J2, fileOutputStream, null);
                        fileOutputStream.close();
                        if (this.f21846f) {
                            file2.delete();
                        } else {
                            ((DownloadManager) t0.f25566b.getSystemService("download")).addCompletedDownload(file2.getName(), file2.getName(), false, mimeTypeFromExtension, file2.getAbsolutePath(), file2.length(), true);
                            this.f21847n++;
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
                float size = (100.0f / this.f21844c.size()) + this.f21845e;
                this.f21845e = size;
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
                g0.h3(new af(this, (int) com.google.android.recaptcha.internal.a.c(((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()), this.f21844c.size(), 100.0f, this.f21845e), 0));
            }
        } else if (hashMap.remove((String) objArr[0]) != null) {
            this.f21848r.countDown();
        }
    }
}
