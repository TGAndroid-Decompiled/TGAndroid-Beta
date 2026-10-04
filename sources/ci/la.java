package ci;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class la implements Runnable {
    public final int f5501a;
    public final Bitmap f5502b;
    public final File f5503c;

    public la(Bitmap bitmap, File file, int i10) {
        this.f5501a = i10;
        this.f5502b = bitmap;
        this.f5503c = file;
    }

    @Override
    public final void run() {
        switch (this.f5501a) {
            case 0:
                try {
                    this.f5502b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f5503c));
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                Bitmap bitmap = this.f5502b;
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f5503c));
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
                Bitmap bitmap2 = this.f5502b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f5503c));
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    return;
                } finally {
                    AndroidUtilities.recycleBitmap(bitmap2);
                }
            case 3:
                try {
                    this.f5502b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f5503c));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 4:
                try {
                    this.f5502b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f5503c));
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            default:
                File file = this.f5503c;
                Bitmap bitmap3 = this.f5502b;
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

    public la(File file, Bitmap bitmap) {
        this.f5501a = 5;
        this.f5503c = file;
        this.f5502b = bitmap;
    }
}
