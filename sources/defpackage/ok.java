package defpackage;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class ok implements PixelCopy.OnPixelCopyFinishedListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public ok(Object obj, Object obj2, byte b) {
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
            default:
                fi6 fi6Var = (fi6) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                fi6Var.h = false;
                if (!fi6Var.i && i == 0) {
                    fi6Var.f = fi6Var.e;
                    fi6Var.e = bitmap;
                    fi6Var.a.run();
                    return;
                }
                return;
        }
    }
}
