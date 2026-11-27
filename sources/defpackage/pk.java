package defpackage;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class pk implements PixelCopy.OnPixelCopyFinishedListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public pk(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void onPixelCopyFinished(int i) {
        boolean z;
        switch (this.a) {
            case 0:
                boolean[] zArr = (boolean[]) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[0] = z;
                countDownLatch.countDown();
                return;
            case 1:
                rr0 rr0Var = (rr0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                rr0Var.getClass();
                if (i == 0) {
                    float f = 0.0f;
                    for (int i2 = 0; i2 < 16; i2++) {
                        for (int i3 = 0; i3 < 4; i3++) {
                            f += hl.B(bitmap.getPixel(i2, i3));
                        }
                    }
                    float f2 = f / 64.0f;
                    bitmap.recycle();
                    if (Math.abs(f2 - rr0Var.r) >= 0.02f) {
                        rr0Var.r = f2;
                        rr0Var.checkSystemBarColors();
                        return;
                    }
                    return;
                }
                return;
            default:
                jk6 jk6Var = (jk6) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                jk6Var.h = false;
                if (!jk6Var.i && i == 0) {
                    jk6Var.f = jk6Var.e;
                    jk6Var.e = bitmap2;
                    jk6Var.a.run();
                    return;
                }
                return;
        }
    }
}
