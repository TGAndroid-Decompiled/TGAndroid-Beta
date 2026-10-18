package ai;

import org.telegram.tgnet.TLRPC;
public final class i3 implements Runnable {
    public final int f1474a;
    public final k7 f1475b;
    public final TLRPC.TL_error f1476c;
    public final Runnable d;

    public i3(k7 k7Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f1474a = i10;
        this.f1475b = k7Var;
        this.f1476c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f1474a) {
            case 0:
                this.f1475b.getBulletinFactory().f0(this.f1476c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f1475b.getBulletinFactory().f0(this.f1476c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
