package defpackage;

import org.telegram.tgnet.TLRPC;
public final class e97 implements Runnable {
    public final byte a;
    public final oc7 b;
    public final TLRPC.TL_error c;
    public final long d;

    public e97(oc7 oc7Var, TLRPC.TL_error tL_error, long j, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = tL_error;
        this.d = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TLRPC.TL_error tL_error = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                oc7Var.B(j, tL_error.text);
                nm7.f(oc7Var.currentAccount).k(338, Long.valueOf(j));
                return;
            default:
                oc7Var.B(j, tL_error.text);
                oc7Var.l1.remove(Long.valueOf(j));
                return;
        }
    }
}
