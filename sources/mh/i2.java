package mh;

import org.telegram.tgnet.TLRPC;
public final class i2 implements Runnable {
    public final int f14227a;
    public final g5 f14228b;
    public final TLRPC.TL_error f14229c;
    public final Runnable d;

    public i2(g5 g5Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f14227a = i10;
        this.f14228b = g5Var;
        this.f14229c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f14227a) {
            case 0:
                this.f14228b.getBulletinFactory().d0(this.f14229c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f14228b.getBulletinFactory().d0(this.f14229c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
