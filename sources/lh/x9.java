package lh;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public final class x9 implements Runnable {

    public final int f17051a;

    public final Bitmap f17052b;

    public final File f17053c;

    public x9(Bitmap bitmap, File file, int i10) {
        this.f17051a = i10;
        this.f17052b = bitmap;
        this.f17053c = file;
    }

    @Override
    public final void run() {
        switch (this.f17051a) {
            case 0:
                try {
                    this.f17052b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f17053c));
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 1:
                Bitmap bitmap = this.f17052b;
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f17053c));
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
                } catch (Throwable th) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    throw th;
                }
            case 2:
                Bitmap bitmap2 = this.f17052b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f17053c));
                        break;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        break;
                    }
                    return;
                } finally {
                    AndroidUtilities.recycleBitmap(bitmap2);
                }
            case 3:
                try {
                    this.f17052b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f17053c));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 4:
                try {
                    this.f17052b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f17053c));
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            default:
                File file = this.f17053c;
                Bitmap bitmap3 = this.f17052b;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap3.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                        fileOutputStream.close();
                        return;
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                            break;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Exception e14) {
                    FileLog.e(e14);
                    return;
                }
        }
    }

    public x9(File file, Bitmap bitmap) {
        this.f17051a = 5;
        this.f17053c = file;
        this.f17052b = bitmap;
    }
}
