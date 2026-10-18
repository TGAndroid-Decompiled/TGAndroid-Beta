package ai;

import org.telegram.tgnet.TLRPC;
public final class g3 implements Runnable {
    public final int f1335a;
    public final k7 f1336b;
    public final TLRPC.TL_error f1337c;
    public final Runnable d;

    public g3(k7 k7Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f1335a = i10;
        this.f1336b = k7Var;
        this.f1337c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f1335a) {
            case 0:
                this.f1336b.getBulletinFactory().f0(this.f1337c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f1336b.getBulletinFactory().f0(this.f1337c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
