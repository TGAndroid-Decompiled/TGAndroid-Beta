package defpackage;

import org.telegram.tgnet.TLRPC;
public final class au1 implements Runnable {
    public final byte a;
    public final k47 b;

    public au1(a6a a6aVar, k47 k47Var) {
        this.a = (byte) 2;
        this.b = k47Var;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        byte b = this.a;
        k47 k47Var = this.b;
        switch (b) {
            case 0:
                k47Var.q = false;
                return;
            case 1:
                if (v0c.k(k47Var)) {
                    v0c.z(k47Var, false, null);
                    return;
                }
                return;
            case 2:
                if (k47Var != null && (message = k47Var.k) != null) {
                    message.reqId = 0;
                    return;
                }
                return;
            case 3:
                n50 n50Var = (n50) cmb.d5.remove(k47Var);
                if (n50Var != null) {
                    n50Var.i = null;
                    return;
                }
                return;
            default:
                nm7.f(k47Var.K1).k(116, k47Var);
                return;
        }
    }

    public au1(k47 k47Var, byte b) {
        this.a = b;
        this.b = k47Var;
    }
}
