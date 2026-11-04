package gi;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
public final class a9 implements Runnable {
    public final int f12409a;
    public final Bitmap f12410b;
    public final File f12411c;

    public a9(Bitmap bitmap, File file, int i3) {
        this.f12409a = i3;
        this.f12410b = bitmap;
        this.f12411c = file;
    }

    @Override
    public final void run() {
        switch (this.f12409a) {
            case 0:
                try {
                    this.f12410b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f12411c));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                Bitmap bitmap = this.f12410b;
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f12411c));
                        if (bitmap.isRecycled()) {
                            return;
                        }
                    } catch (Throwable th2) {
                        if (!bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                        throw th2;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    if (bitmap.isRecycled()) {
                        return;
                    }
                }
                bitmap.recycle();
                return;
            case 2:
                Bitmap bitmap2 = this.f12410b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f12411c));
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    return;
                } finally {
                    org.telegram.messenger.g0.z2(bitmap2);
                }
            case 3:
                try {
                    this.f12410b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f12411c));
                    return;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 4:
                try {
                    this.f12410b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f12411c));
                    return;
                } catch (Exception e14) {
                    org.telegram.messenger.a8.g(e14, true);
                    return;
                }
            default:
                File file = this.f12411c;
                Bitmap bitmap3 = this.f12410b;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmap3.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                    return;
                }
        }
    }

    public a9(File file, Bitmap bitmap) {
        this.f12409a = 5;
        this.f12411c = file;
        this.f12410b = bitmap;
    }
}
