package ai;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f1618a;
    public final k7 f1619b;
    public final TLRPC.TL_error f1620c;
    public final Runnable d;

    public k3(k7 k7Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f1618a = i10;
        this.f1619b = k7Var;
        this.f1620c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f1618a) {
            case 0:
                this.f1619b.getBulletinFactory().f0(this.f1620c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f1619b.getBulletinFactory().f0(this.f1620c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
