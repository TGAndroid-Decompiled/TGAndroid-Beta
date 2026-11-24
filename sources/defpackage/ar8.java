package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ar8 implements ln5 {
    public final Runnable[] a;

    public ar8(Runnable[] runnableArr) {
        this.a = runnableArr;
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        if (imageReceiver.B()) {
            Runnable[] runnableArr = this.a;
            if (runnableArr[0] != null) {
                p09 y = imageReceiver.y();
                if (y == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (y.t()) {
                    y.B0 = new pp8(runnableArr, (byte) 5);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }
}
