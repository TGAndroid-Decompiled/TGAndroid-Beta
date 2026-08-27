package hh;

import org.telegram.tgnet.TLRPC;

public final class l2 implements Runnable {

    public final int f9662a;

    public final i5 f9663b;

    public final TLRPC.TL_error f9664c;
    public final Runnable d;

    public l2(i5 i5Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f9662a = i10;
        this.f9663b = i5Var;
        this.f9664c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f9662a) {
            case 0:
                this.f9663b.getBulletinFactory().d0(this.f9664c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                this.f9663b.getBulletinFactory().d0(this.f9664c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
        }
    }
}
