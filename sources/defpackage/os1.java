package defpackage;

import org.telegram.tgnet.TLRPC;
public final class os1 implements Runnable {
    public final byte a;
    public final k27 b;

    public os1(z3a z3aVar, k27 k27Var) {
        this.a = (byte) 2;
        this.b = k27Var;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        byte b = this.a;
        k27 k27Var = this.b;
        switch (b) {
            case 0:
                k27Var.q = false;
                return;
            case 1:
                if (uyb.k(k27Var)) {
                    uyb.z(k27Var, false, null);
                    return;
                }
                return;
            case 2:
                if (k27Var != null && (message = k27Var.k) != null) {
                    message.reqId = 0;
                    return;
                }
                return;
            case 3:
                n40 n40Var = (n40) bkb.d5.remove(k27Var);
                if (n40Var != null) {
                    n40Var.i = null;
                    return;
                }
                return;
            default:
                kk7.f(k27Var.K1).k(115, k27Var);
                return;
        }
    }

    public os1(k27 k27Var, byte b) {
        this.a = b;
        this.b = k27Var;
    }
}
