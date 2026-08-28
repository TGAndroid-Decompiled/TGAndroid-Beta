package kh;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class aa implements Runnable {
    public final int f14967a;
    public final Bitmap f14968b;
    public final File f14969c;

    public aa(Bitmap bitmap, File file, int i9) {
        this.f14967a = i9;
        this.f14968b = bitmap;
        this.f14969c = file;
    }

    @Override
    public final void run() {
        switch (this.f14967a) {
            case 0:
                try {
                    this.f14968b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f14969c));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                Bitmap bitmap = this.f14968b;
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f14969c));
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
                } catch (Throwable th) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    throw th;
                }
            case 2:
                Bitmap bitmap2 = this.f14968b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f14969c));
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    return;
                } finally {
                    AndroidUtilities.recycleBitmap(bitmap2);
                }
            case 3:
                try {
                    this.f14968b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f14969c));
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            case 4:
                try {
                    this.f14968b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f14969c));
                    return;
                } catch (Exception e14) {
                    FileLog.e(e14);
                    return;
                }
            default:
                File file = this.f14969c;
                Bitmap bitmap3 = this.f14968b;
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

    public aa(File file, Bitmap bitmap) {
        this.f14967a = 5;
        this.f14969c = file;
        this.f14968b = bitmap;
    }
}
