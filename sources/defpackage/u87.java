package defpackage;

import org.telegram.tgnet.TLRPC;
public final class u87 implements Runnable {
    public final byte a;
    public final uc7 b;
    public final TLRPC.TL_error c;
    public final long d;

    public u87(uc7 uc7Var, TLRPC.TL_error tL_error, long j, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = tL_error;
        this.d = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TLRPC.TL_error tL_error = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                uc7Var.D(j, tL_error.text);
                jn7.f(uc7Var.currentAccount).k(337, Long.valueOf(j));
                return;
            default:
                uc7Var.D(j, tL_error.text);
                uc7Var.l1.remove(Long.valueOf(j));
                return;
        }
    }
}
