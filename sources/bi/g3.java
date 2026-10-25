package bi;

import org.telegram.tgnet.TLRPC;
public final class g3 implements Runnable {
    public final int f4645a;
    public final h7 f4646b;
    public final TLRPC.TL_error f4647c;
    public final Runnable d;

    public g3(h7 h7Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f4645a = i10;
        this.f4646b = h7Var;
        this.f4647c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f4645a) {
            case 0:
                this.f4646b.getBulletinFactory().g0(this.f4647c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f4646b.getBulletinFactory().g0(this.f4647c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
