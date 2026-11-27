package defpackage;

import org.telegram.messenger.voip.OpusDred;
public final class x77 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final Runnable[] c;

    public x77(boolean[] zArr, Runnable[] runnableArr, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = runnableArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Runnable[] runnableArr = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                zArr[0] = true;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                OpusDred.f(zArr, runnableArr);
                return;
            default:
                zArr[0] = true;
                Runnable runnable2 = runnableArr[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
