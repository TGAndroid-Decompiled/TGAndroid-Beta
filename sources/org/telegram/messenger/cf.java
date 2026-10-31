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
public final class cf implements us {
    public c f15011a;
    public org.telegram.ui.ActionBar.x1 f15012b;
    public ArrayList f15013c;
    public HashMap d;
    public float e;
    public boolean f15014f;
    public boolean h;
    public int f15015n;
    public CountDownLatch f15016r;
    public bs f15017s;
    public boolean f15018w;

    public final void a(java.io.File r28, java.io.File r29, java.lang.String r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cf.a(java.io.File, java.io.File, java.lang.String):void");
    }

    public final boolean b(jj jjVar) {
        TLRPC.MessageMedia o12;
        TLRPC.Photo photo;
        TLRPC.PhotoSize w9;
        ?? r22;
        ?? r62;
        boolean z10 = false;
        if (!jjVar.D3() || (o12 = jj.o1(jjVar.f16337k)) == null || (photo = o12.photo) == null || o12.document == null || (w9 = b8.w(photo.sizes, i0.Z0(true), false, null, true)) == null) {
            return false;
        }
        b8.G(this.f15011a.f14863a);
        File K = b8.K(w9, null, false, true);
        File K2 = b8.K(o12.document, null, false, true);
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
        int i10 = r22 + r62;
        if (i10 > 0) {
            this.f15016r = new CountDownLatch(i10);
            i0.g3(new kh(this, (boolean) r22, w9, jjVar, o12.photo, (boolean) r62, o12.document));
            this.f15016r.await();
        }
        if (!this.f15014f) {
            if (K == null || !K.exists()) {
                K = b8.K(w9, null, true, true);
            }
            if (K2 == null || !K2.exists()) {
                K2 = b8.K(o12.document, null, true, true);
            }
            if (K != null && K.exists() && K2 != null && K2.exists()) {
                String D = b8.D(K);
                if (TextUtils.isEmpty(D)) {
                    D = "jpg";
                }
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(D.toLowerCase());
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    mimeTypeFromExtension = "image/jpeg";
                }
                String p02 = i0.p0(0, D);
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentValues contentValues = new ContentValues();
                    Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
                    contentValues.put("relative_path", new File(Environment.DIRECTORY_DOWNLOADS, "Telegram") + File.separator);
                    contentValues.put("_display_name", p02);
                    contentValues.put("mime_type", mimeTypeFromExtension);
                    Uri insert = w0.f19025b.getContentResolver().insert(contentUri, contentValues);
                    if (insert != null) {
                        OutputStream openOutputStream = w0.f19025b.getContentResolver().openOutputStream(insert);
                        if (openOutputStream != null) {
                            try {
                                MediaController.H0(K, K2, openOutputStream, null);
                                z10 = !this.f15014f;
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
                            this.f15015n++;
                        } else {
                            try {
                                w0.f19025b.getContentResolver().delete(insert, null, null);
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
                        if (this.f15014f) {
                            file2.delete();
                        } else {
                            ((DownloadManager) w0.f19025b.getSystemService("download")).addCompletedDownload(file2.getName(), file2.getName(), false, mimeTypeFromExtension, file2.getAbsolutePath(), file2.length(), true);
                            this.f15015n++;
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
                float size = (100.0f / this.f15013c.size()) + this.e;
                this.e = size;
                i0.g3(new af(this, (int) size, 3));
                return true;
            }
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        HashMap hashMap = this.d;
        if (i10 != zs.Y1 && i10 != zs.Z1) {
            if (i10 == zs.X1 && hashMap.containsKey((String) objArr[0])) {
                i0.g3(new af(this, (int) a1.g.c(((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()), this.f15013c.size(), 100.0f, this.e), 0));
            }
        } else if (hashMap.remove((String) objArr[0]) != null) {
            this.f15016r.countDown();
        }
    }
}
