package defpackage;

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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
public final class fo6 implements jm7 {
    public j5 a;
    public he b;
    public ArrayList c;
    public HashMap d;
    public float e;
    public boolean f;
    public boolean h;
    public int n;
    public CountDownLatch r;
    public we7 s;
    public boolean w;

    public final void a(java.io.File r28, java.io.File r29, java.lang.String r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo6.a(java.io.File, java.io.File, java.lang.String):void");
    }

    public final boolean b(k47 k47Var) {
        TLRPC.MessageMedia n1;
        TLRPC.Photo photo;
        TLRPC.PhotoSize w;
        ?? r2;
        ?? r6;
        boolean z = false;
        if (!k47Var.D3() || (n1 = k47.n1(k47Var.k)) == null || (photo = n1.photo) == null || n1.document == null || (w = bc4.w(photo.sizes, gm.Y0(true), false, null, true)) == null) {
            return false;
        }
        bc4.G(this.a.a);
        File J = bc4.J(w, null, false, true);
        File J2 = bc4.J(n1.document, null, false, true);
        if (J != null && J.exists()) {
            r2 = 0;
        } else {
            r2 = 1;
        }
        if (J2 != null && J2.exists()) {
            r6 = 0;
        } else {
            r6 = 1;
        }
        int i = r2 + r6;
        if (i > 0) {
            this.r = new CountDownLatch(i);
            gm.c3(new zq6(this, (boolean) r2, w, k47Var, n1.photo, (boolean) r6, n1.document));
            this.r.await();
        }
        if (!this.f) {
            if (J == null || !J.exists()) {
                J = bc4.J(w, null, true, true);
            }
            if (J2 == null || !J2.exists()) {
                J2 = bc4.J(n1.document, null, true, true);
            }
            if (J != null && J.exists() && J2 != null && J2.exists()) {
                String D = bc4.D(J);
                if (TextUtils.isEmpty(D)) {
                    D = "jpg";
                }
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(D.toLowerCase());
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    mimeTypeFromExtension = "image/jpeg";
                }
                String p0 = gm.p0(0, D);
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentValues contentValues = new ContentValues();
                    Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
                    contentValues.put("relative_path", new File(Environment.DIRECTORY_DOWNLOADS, "Telegram") + File.separator);
                    contentValues.put("_display_name", p0);
                    contentValues.put("mime_type", mimeTypeFromExtension);
                    Uri insert = a.b.getContentResolver().insert(contentUri, contentValues);
                    if (insert != null) {
                        OutputStream openOutputStream = a.b.getContentResolver().openOutputStream(insert);
                        if (openOutputStream != null) {
                            try {
                                MediaController.H0(J, J2, openOutputStream, null);
                                z = !this.f;
                                openOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    openOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        if (z) {
                            this.n++;
                        } else {
                            try {
                                a.b.getContentResolver().delete(insert, null, null);
                            } catch (Exception unused) {
                            }
                        }
                    }
                } else {
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Telegram");
                    file.mkdirs();
                    File file2 = new File(file, p0);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        MediaController.H0(J, J2, fileOutputStream, null);
                        fileOutputStream.close();
                        if (this.f) {
                            file2.delete();
                        } else {
                            ((DownloadManager) a.b.getSystemService("download")).addCompletedDownload(file2.getName(), file2.getName(), false, mimeTypeFromExtension, file2.getAbsolutePath(), file2.length(), true);
                            this.n++;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                float size = (100.0f / this.c.size()) + this.e;
                this.e = size;
                gm.c3(new do6(this, (int) size, (byte) 3));
                return true;
            }
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        HashMap hashMap = this.d;
        if (i != nm7.Y1 && i != nm7.Z1) {
            if (i == nm7.X1 && hashMap.containsKey((String) objArr[0])) {
                gm.c3(new do6(this, (int) b10.A(((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()), this.c.size(), 100.0f, this.e), (byte) 0));
            }
        } else if (hashMap.remove((String) objArr[0]) != null) {
            this.r.countDown();
        }
    }
}
