package fi;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
public final class z8 implements Runnable {
    public final int f13255a;
    public final Bitmap f13256b;
    public final File f13257c;

    public z8(Bitmap bitmap, File file, int i7) {
        this.f13255a = i7;
        this.f13256b = bitmap;
        this.f13257c = file;
    }

    @Override
    public final void run() {
        switch (this.f13255a) {
            case 0:
                try {
                    this.f13256b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f13257c));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                Bitmap bitmap = this.f13256b;
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f13257c));
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
                Bitmap bitmap2 = this.f13256b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f13257c));
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    return;
                } finally {
                    org.telegram.messenger.g0.z2(bitmap2);
                }
            case 3:
                try {
                    this.f13256b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f13257c));
                    return;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 4:
                try {
                    this.f13256b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f13257c));
                    return;
                } catch (Exception e14) {
                    org.telegram.messenger.a8.g(e14, true);
                    return;
                }
            default:
                File file = this.f13257c;
                Bitmap bitmap3 = this.f13256b;
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

    public z8(File file, Bitmap bitmap) {
        this.f13255a = 5;
        this.f13257c = file;
        this.f13256b = bitmap;
    }
}
