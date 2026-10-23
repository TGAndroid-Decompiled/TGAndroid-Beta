package ei;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class y9 implements Runnable {
    public final int f10164a;
    public final Bitmap f10165b;
    public final File f10166c;

    public y9(Bitmap bitmap, File file, int i10) {
        this.f10164a = i10;
        this.f10165b = bitmap;
        this.f10166c = file;
    }

    @Override
    public final void run() {
        switch (this.f10164a) {
            case 0:
                try {
                    this.f10165b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f10166c));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Bitmap bitmap = this.f10165b;
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f10166c));
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
                Bitmap bitmap2 = this.f10165b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f10166c));
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    return;
                } finally {
                    AndroidUtilities.recycleBitmap(bitmap2);
                }
            case 3:
                try {
                    this.f10165b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f10166c));
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 4:
                try {
                    this.f10165b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f10166c));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            default:
                File file = this.f10166c;
                Bitmap bitmap3 = this.f10165b;
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

    public y9(File file, Bitmap bitmap) {
        this.f10164a = 5;
        this.f10166c = file;
        this.f10165b = bitmap;
    }
}
