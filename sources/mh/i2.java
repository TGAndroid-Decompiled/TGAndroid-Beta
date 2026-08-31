package mh;

import org.telegram.tgnet.TLRPC;
public final class i2 implements Runnable {
    public final int f14225a;
    public final g5 f14226b;
    public final TLRPC.TL_error f14227c;
    public final Runnable d;

    public i2(g5 g5Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f14225a = i10;
        this.f14226b = g5Var;
        this.f14227c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f14225a) {
            case 0:
                this.f14226b.getBulletinFactory().d0(this.f14227c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f14226b.getBulletinFactory().d0(this.f14227c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
