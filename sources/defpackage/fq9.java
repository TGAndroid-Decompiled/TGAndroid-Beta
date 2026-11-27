package defpackage;

import j$.util.Objects;
import org.telegram.messenger.a;
public final class fq9 implements Runnable {
    public final byte a;
    public final kq9 b;

    public fq9(kq9 kq9Var, byte b) {
        this.a = b;
        this.b = kq9Var;
    }

    @Override
    public final void run() {
        jq9 jq9Var;
        byte b = this.a;
        kq9 kq9Var = this.b;
        switch (b) {
            case 0:
                kq9Var.Q = null;
                kq9Var.J();
                return;
            default:
                boolean z = kq9Var.w;
                if (!z) {
                    rr9 rr9Var = kq9Var.O;
                    if (rr9Var != null) {
                        if (kq9Var.P) {
                            kq9Var.P = false;
                            xz0 xz0Var = rr9Var.e;
                            Objects.requireNonNull(xz0Var);
                            rr9Var.b.post(new gz0(xz0Var, (byte) 7));
                            return;
                        }
                        return;
                    }
                    kq9Var.P = false;
                    if (!z && rr9Var == null) {
                        if (!kq9Var.G) {
                            kq9Var.G = true;
                            hl.c3(new u96(kq9Var, (byte) 3));
                        }
                        rr9 rr9Var2 = new rr9(kq9Var.e, kq9Var.f, kq9Var.k(), new iq9(kq9Var));
                        kq9Var.O = rr9Var2;
                        qr9 qr9Var = kq9Var.U;
                        if (qr9Var != null) {
                            jq9Var = new jq9(kq9Var, qr9Var);
                        } else {
                            jq9Var = null;
                        }
                        kq9Var.V = jq9Var;
                        rr9Var2.l(jq9Var, null);
                        rr9 rr9Var3 = kq9Var.O;
                        float f = kq9Var.H;
                        rr9Var3.getClass();
                        rr9Var3.b.post(new jt(rr9Var3, f, (byte) 5));
                        kq9Var.O.k(a.o());
                        rr9 rr9Var4 = kq9Var.O;
                        rr9Var4.getClass();
                        rr9Var4.b.post(new hq9(rr9Var4, (byte) 3));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
