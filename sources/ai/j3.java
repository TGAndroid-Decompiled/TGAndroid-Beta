package ai;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f1574a;
    public final k7 f1575b;
    public final TLRPC.TL_error f1576c;
    public final Runnable d;

    public j3(k7 k7Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f1574a = i10;
        this.f1575b = k7Var;
        this.f1576c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f1574a) {
            case 0:
                this.f1575b.getBulletinFactory().f0(this.f1576c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f1575b.getBulletinFactory().f0(this.f1576c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
