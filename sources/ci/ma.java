package ci;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ma implements Runnable {
    public final int f5181a;
    public final Bitmap f5182b;
    public final File f5183c;

    public ma(Bitmap bitmap, File file, int i10) {
        this.f5181a = i10;
        this.f5182b = bitmap;
        this.f5183c = file;
    }

    @Override
    public final void run() {
        switch (this.f5181a) {
            case 0:
                try {
                    this.f5182b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f5183c));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Bitmap bitmap = this.f5182b;
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f5183c));
                        if (bitmap.isRecycled()) {
                            return;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
                Bitmap bitmap2 = this.f5182b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f5183c));
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    return;
                } finally {
                    AndroidUtilities.recycleBitmap(bitmap2);
                }
            case 3:
                try {
                    this.f5182b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f5183c));
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 4:
                try {
                    this.f5182b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f5183c));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            default:
                File file = this.f5183c;
                Bitmap bitmap3 = this.f5182b;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmap3.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
        }
    }

    public ma(File file, Bitmap bitmap) {
        this.f5181a = 5;
        this.f5183c = file;
        this.f5182b = bitmap;
    }
}
