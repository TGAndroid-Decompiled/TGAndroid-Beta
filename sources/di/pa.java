package di;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class pa implements Runnable {
    public final int f7837a;
    public final Bitmap f7838b;
    public final File f7839c;

    public pa(Bitmap bitmap, File file, int i10) {
        this.f7837a = i10;
        this.f7838b = bitmap;
        this.f7839c = file;
    }

    @Override
    public final void run() {
        switch (this.f7837a) {
            case 0:
                try {
                    this.f7838b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f7839c));
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                Bitmap bitmap = this.f7838b;
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f7839c));
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
                Bitmap bitmap2 = this.f7838b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f7839c));
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    return;
                } finally {
                    AndroidUtilities.recycleBitmap(bitmap2);
                }
            case 3:
                try {
                    this.f7838b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f7839c));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 4:
                try {
                    this.f7838b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f7839c));
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            default:
                File file = this.f7839c;
                Bitmap bitmap3 = this.f7838b;
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

    public pa(File file, Bitmap bitmap) {
        this.f7837a = 5;
        this.f7839c = file;
        this.f7838b = bitmap;
    }
}
