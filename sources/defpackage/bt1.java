package defpackage;

import org.telegram.tgnet.TLRPC;
public final class bt1 implements Runnable {
    public final byte a;
    public final r47 b;

    public bt1(r7a r7aVar, r47 r47Var) {
        this.a = (byte) 2;
        this.b = r47Var;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        byte b = this.a;
        r47 r47Var = this.b;
        switch (b) {
            case 0:
                r47Var.q = false;
                return;
            case 1:
                if (u2c.k(r47Var)) {
                    u2c.z(r47Var, false, null);
                    return;
                }
                return;
            case 2:
                if (r47Var != null && (message = r47Var.k) != null) {
                    message.reqId = 0;
                    return;
                }
                return;
            case 3:
                p40 p40Var = (p40) aob.e5.remove(r47Var);
                if (p40Var != null) {
                    p40Var.i = null;
                    return;
                }
                return;
            default:
                jn7.f(r47Var.K1).k(116, r47Var);
                return;
        }
    }

    public bt1(r47 r47Var, byte b) {
        this.a = b;
        this.b = r47Var;
    }
}
