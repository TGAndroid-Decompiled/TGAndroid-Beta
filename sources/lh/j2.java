package lh;

import org.telegram.tgnet.TLRPC;
public final class j2 implements Runnable {
    public final int f12645a;
    public final g5 f12646b;
    public final TLRPC.TL_error f12647c;
    public final Runnable d;

    public j2(g5 g5Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f12645a = i10;
        this.f12646b = g5Var;
        this.f12647c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f12645a) {
            case 0:
                this.f12646b.getBulletinFactory().d0(this.f12647c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f12646b.getBulletinFactory().d0(this.f12647c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
