package ai;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f1632a;
    public final l7 f1633b;
    public final TLRPC.TL_error f1634c;
    public final Runnable d;

    public k3(l7 l7Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f1632a = i10;
        this.f1633b = l7Var;
        this.f1634c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f1632a) {
            case 0:
                this.f1633b.getBulletinFactory().f0(this.f1634c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f1633b.getBulletinFactory().f0(this.f1634c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
