package fi;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class u9 implements Runnable {
    public final int f11763a;
    public final Bitmap f11764b;
    public final File f11765c;

    public u9(Bitmap bitmap, File file, int i10) {
        this.f11763a = i10;
        this.f11764b = bitmap;
        this.f11765c = file;
    }

    @Override
    public final void run() {
        switch (this.f11763a) {
            case 0:
                try {
                    this.f11764b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f11765c));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Bitmap bitmap = this.f11764b;
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f11765c));
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
                Bitmap bitmap2 = this.f11764b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f11765c));
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    return;
                } finally {
                    AndroidUtilities.recycleBitmap(bitmap2);
                }
            case 3:
                try {
                    this.f11764b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f11765c));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 4:
                try {
                    this.f11764b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f11765c));
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            default:
                File file = this.f11765c;
                Bitmap bitmap3 = this.f11764b;
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
        this.f11763a = 5;
        this.f11765c = file;
        this.f11764b = bitmap;
    }
}
