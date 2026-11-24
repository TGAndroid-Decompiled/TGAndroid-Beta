package defpackage;

import j$.util.Objects;
import org.telegram.messenger.a;
public final class rm9 implements Runnable {
    public final byte a;
    public final um9 b;

    public rm9(um9 um9Var, byte b) {
        this.a = b;
        this.b = um9Var;
    }

    @Override
    public final void run() {
        tm9 tm9Var;
        byte b = this.a;
        um9 um9Var = this.b;
        switch (b) {
            case 0:
                boolean z = um9Var.w;
                if (!z) {
                    ao9 ao9Var = um9Var.O;
                    if (ao9Var != null) {
                        if (um9Var.P) {
                            um9Var.P = false;
                            pz0 pz0Var = ao9Var.e;
                            Objects.requireNonNull(pz0Var);
                            ao9Var.b.post(new yy0(pz0Var, (byte) 7));
                            return;
                        }
                        return;
                    }
                    um9Var.P = false;
                    if (!z && ao9Var == null) {
                        if (!um9Var.G) {
                            um9Var.G = true;
                            gl.c3(new r76(um9Var, (byte) 8));
                        }
                        ao9 ao9Var2 = new ao9(um9Var.e, um9Var.f, um9Var.k(), new sm9(um9Var));
                        um9Var.O = ao9Var2;
                        zn9 zn9Var = um9Var.U;
                        if (zn9Var != null) {
                            tm9Var = new tm9(um9Var, zn9Var);
                        } else {
                            tm9Var = null;
                        }
                        um9Var.V = tm9Var;
                        ao9Var2.l(tm9Var, null);
                        ao9 ao9Var3 = um9Var.O;
                        float f = um9Var.H;
                        ao9Var3.getClass();
                        ao9Var3.b.post(new kt(ao9Var3, f, (byte) 5));
                        um9Var.O.k(a.o());
                        ao9 ao9Var4 = um9Var.O;
                        ao9Var4.getClass();
                        ao9Var4.b.post(new qm9(ao9Var4, (byte) 3));
                        return;
                    }
                    return;
                }
                return;
            default:
                um9Var.Q = null;
                um9Var.J();
                return;
        }
    }
}
