package nh;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class l9 implements Runnable {
    public final int f18052a;
    public final Bitmap f18053b;
    public final File f18054c;

    public l9(Bitmap bitmap, File file, int i10) {
        this.f18052a = i10;
        this.f18053b = bitmap;
        this.f18054c = file;
    }

    @Override
    public final void run() {
        switch (this.f18052a) {
            case 0:
                try {
                    this.f18053b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f18054c));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                Bitmap bitmap = this.f18053b;
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f18054c));
                        if (bitmap.isRecycled()) {
                            return;
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
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
                Bitmap bitmap2 = this.f18053b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f18054c));
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    return;
                } finally {
                    AndroidUtilities.recycleBitmap(bitmap2);
                }
            case 3:
                try {
                    this.f18053b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f18054c));
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            case 4:
                try {
                    this.f18053b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f18054c));
                    return;
                } catch (Exception e14) {
                    FileLog.e(e14);
                    return;
                }
            default:
                File file = this.f18054c;
                Bitmap bitmap3 = this.f18053b;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmap3.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                } catch (Exception e15) {
                    FileLog.e(e15);
                    return;
                }
        }
    }

    public l9(File file, Bitmap bitmap) {
        this.f18052a = 5;
        this.f18054c = file;
        this.f18053b = bitmap;
    }
}
