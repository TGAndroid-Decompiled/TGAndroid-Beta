package fi;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class u9 implements Runnable {
    public final int f11764a;
    public final Bitmap f11765b;
    public final File f11766c;

    public u9(Bitmap bitmap, File file, int i10) {
        this.f11764a = i10;
        this.f11765b = bitmap;
        this.f11766c = file;
    }

    @Override
    public final void run() {
        switch (this.f11764a) {
            case 0:
                try {
                    this.f11765b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f11766c));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Bitmap bitmap = this.f11765b;
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f11766c));
                        if (bitmap.isRecycled()) {
                            return;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (bitmap == null || bitmap.isRecycled()) {
                            return;
                        }
                    }
                    bitmap.recycle();
                    return;
                } catch (Throwable th2) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    throw th2;
                }
            case 2:
                Bitmap bitmap2 = this.f11765b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f11766c));
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    return;
                } finally {
                    AndroidUtilities.recycleBitmap(bitmap2);
                }
            case 3:
                try {
                    this.f11765b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f11766c));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 4:
                try {
                    this.f11765b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f11766c));
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            default:
                File file = this.f11766c;
                Bitmap bitmap3 = this.f11765b;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmap3.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                } catch (Exception e14) {
                    FileLog.e(e14);
                    return;
                }
        }
    }

    public u9(File file, Bitmap bitmap) {
        this.f11764a = 5;
        this.f11766c = file;
        this.f11765b = bitmap;
    }
}
