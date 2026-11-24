package defpackage;

import j$.util.Objects;
import org.telegram.messenger.a;
public final class so9 implements Runnable {
    public final byte a;
    public final vo9 b;

    public so9(vo9 vo9Var, byte b) {
        this.a = b;
        this.b = vo9Var;
    }

    @Override
    public final void run() {
        uo9 uo9Var;
        byte b = this.a;
        vo9 vo9Var = this.b;
        switch (b) {
            case 0:
                boolean z = vo9Var.w;
                if (!z) {
                    bq9 bq9Var = vo9Var.O;
                    if (bq9Var != null) {
                        if (vo9Var.P) {
                            vo9Var.P = false;
                            w01 w01Var = bq9Var.e;
                            Objects.requireNonNull(w01Var);
                            bq9Var.b.post(new f01(w01Var, (byte) 7));
                            return;
                        }
                        return;
                    }
                    vo9Var.P = false;
                    if (!z && bq9Var == null) {
                        if (!vo9Var.G) {
                            vo9Var.G = true;
                            gm.c3(new q96(vo9Var, (byte) 8));
                        }
                        bq9 bq9Var2 = new bq9(vo9Var.e, vo9Var.f, vo9Var.k(), new to9(vo9Var));
                        vo9Var.O = bq9Var2;
                        aq9 aq9Var = vo9Var.U;
                        if (aq9Var != null) {
                            uo9Var = new uo9(vo9Var, aq9Var);
                        } else {
                            uo9Var = null;
                        }
                        vo9Var.V = uo9Var;
                        bq9Var2.l(uo9Var, null);
                        bq9 bq9Var3 = vo9Var.O;
                        float f = vo9Var.H;
                        bq9Var3.getClass();
                        bq9Var3.b.post(new ku(bq9Var3, f, (byte) 5));
                        vo9Var.O.k(a.o());
                        bq9 bq9Var4 = vo9Var.O;
                        bq9Var4.getClass();
                        bq9Var4.b.post(new ro9(bq9Var4, (byte) 3));
                        return;
                    }
                    return;
                }
                return;
            default:
                vo9Var.Q = null;
                vo9Var.J();
                return;
        }
    }
}
