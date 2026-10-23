package ai;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f1611a;
    public final l7 f1612b;
    public final TLRPC.TL_error f1613c;
    public final Runnable d;

    public k3(l7 l7Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f1611a = i10;
        this.f1612b = l7Var;
        this.f1613c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f1611a) {
            case 0:
                this.f1612b.getBulletinFactory().f0(this.f1613c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f1612b.getBulletinFactory().f0(this.f1613c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
