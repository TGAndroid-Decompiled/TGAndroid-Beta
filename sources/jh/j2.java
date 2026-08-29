package jh;

import org.telegram.tgnet.TLRPC;
public final class j2 implements Runnable {
    public final int f12307a;
    public final h5 f12308b;
    public final TLRPC.TL_error f12309c;
    public final Runnable d;

    public j2(h5 h5Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f12307a = i10;
        this.f12308b = h5Var;
        this.f12309c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f12307a) {
            case 0:
                this.f12308b.getBulletinFactory().d0(this.f12309c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f12308b.getBulletinFactory().d0(this.f12309c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
