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
    public c f21846a;
    public org.telegram.ui.ActionBar.u1 f21847b;
    public ArrayList f21848c;
    public HashMap d;
    public float f21849e;
    public boolean f21850f;
    public boolean h;
    public int f21851n;
    public CountDownLatch f21852r;
    public sr f21853s;
    public boolean f21854w;

    public final void a(java.io.File r28, java.io.File r29, java.lang.String r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cf.a(java.io.File, java.io.File, java.lang.String):void");
    }

    public final boolean b(ij ijVar) {
        TLRPC.MessageMedia n1;
        TLRPC.Photo photo;
        TLRPC.PhotoSize w10;
        ?? r22;
        ?? r62;
        boolean z9 = false;
        if (!ijVar.D3() || (n1 = ij.n1(ijVar.f23266k)) == null || (photo = n1.photo) == null || n1.document == null || (w10 = w7.w(photo.sizes, g0.Z0(true), false, null, true)) == null) {
            return false;
        }
        w7.G(this.f21846a.f21770a);
        File J = w7.J(w10, null, false, true);
        File J2 = w7.J(n1.document, null, false, true);
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
            this.f21852r = new CountDownLatch(i7);
            g0.h3(new mh(this, (boolean) r22, w10, ijVar, n1.photo, (boolean) r62, n1.document));
            this.f21852r.await();
        }
        if (!this.f21850f) {
            if (J == null || !J.exists()) {
                J = w7.J(w10, null, true, true);
            }
            if (J2 == null || !J2.exists()) {
                J2 = w7.J(n1.document, null, true, true);
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
                    Uri insert = t0.f25570b.getContentResolver().insert(contentUri, contentValues);
                    if (insert != null) {
                        OutputStream openOutputStream = t0.f25570b.getContentResolver().openOutputStream(insert);
                        if (openOutputStream != null) {
                            try {
                                MediaController.H0(J, J2, openOutputStream, null);
                                z9 = !this.f21850f;
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
                            this.f21851n++;
                        } else {
                            try {
                                t0.f25570b.getContentResolver().delete(insert, null, null);
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
                        if (this.f21850f) {
                            file2.delete();
                        } else {
                            ((DownloadManager) t0.f25570b.getSystemService("download")).addCompletedDownload(file2.getName(), file2.getName(), false, mimeTypeFromExtension, file2.getAbsolutePath(), file2.length(), true);
                            this.f21851n++;
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
                float size = (100.0f / this.f21848c.size()) + this.f21849e;
                this.f21849e = size;
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
                g0.h3(new af(this, (int) com.google.android.recaptcha.internal.a.c(((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()), this.f21848c.size(), 100.0f, this.f21849e), 0));
            }
        } else if (hashMap.remove((String) objArr[0]) != null) {
            this.f21852r.countDown();
        }
    }
}
