package defpackage;

import org.telegram.tgnet.TLRPC;
public final class y67 implements Runnable {
    public final byte a;
    public final na7 b;
    public final TLRPC.TL_error c;
    public final long d;

    public y67(na7 na7Var, TLRPC.TL_error tL_error, long j, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = tL_error;
        this.d = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TLRPC.TL_error tL_error = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                na7Var.B(j, tL_error.text);
                kk7.f(na7Var.currentAccount).k(336, Long.valueOf(j));
                return;
            default:
                na7Var.B(j, tL_error.text);
                na7Var.l1.remove(Long.valueOf(j));
                return;
        }
    }
}
