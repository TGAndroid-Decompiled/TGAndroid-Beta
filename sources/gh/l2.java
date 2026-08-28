package gh;

import org.telegram.tgnet.TLRPC;
public final class l2 implements Runnable {
    public final int f8485a;
    public final k5 f8486b;
    public final TLRPC.TL_error f8487c;
    public final Runnable d;

    public l2(k5 k5Var, TLRPC.TL_error tL_error, Runnable runnable, int i9) {
        this.f8485a = i9;
        this.f8486b = k5Var;
        this.f8487c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f8485a) {
            case 0:
                this.f8486b.getBulletinFactory().d0(this.f8487c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f8486b.getBulletinFactory().d0(this.f8487c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
