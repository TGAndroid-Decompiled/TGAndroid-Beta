package bi;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class yb implements Runnable {
    public final int f3980a;
    public final Bitmap f3981b;
    public final File f3982c;

    public yb(Bitmap bitmap, File file, int i10) {
        this.f3980a = i10;
        this.f3981b = bitmap;
        this.f3982c = file;
    }

    @Override
    public final void run() {
        switch (this.f3980a) {
            case 0:
                try {
                    this.f3981b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f3982c));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Bitmap bitmap = this.f3981b;
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f3982c));
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
                Bitmap bitmap2 = this.f3981b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f3982c));
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    return;
                } finally {
                    AndroidUtilities.recycleBitmap(bitmap2);
                }
            case 3:
                try {
                    this.f3981b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f3982c));
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 4:
                try {
                    this.f3981b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f3982c));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            default:
                File file = this.f3982c;
                Bitmap bitmap3 = this.f3981b;
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

    public yb(File file, Bitmap bitmap) {
        this.f3980a = 5;
        this.f3982c = file;
        this.f3981b = bitmap;
    }
}
