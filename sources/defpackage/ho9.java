package defpackage;

import j$.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.a;
public final class ho9 implements Runnable {
    public final byte a;
    public final oo9 b;

    public ho9(oo9 oo9Var, byte b) {
        this.a = b;
        this.b = oo9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        oo9 oo9Var = this.b;
        switch (b) {
            case 0:
                oo9Var.C(true);
                return;
            case 1:
                oo9Var.C(true);
                return;
            default:
                bq9 bq9Var = oo9Var.V;
                if (bq9Var != null && oo9Var.X) {
                    oo9Var.X = false;
                    w01 w01Var = bq9Var.e;
                    Objects.requireNonNull(w01Var);
                    bq9Var.b.post(new f01(w01Var, (byte) 7));
                    return;
                } else if (!oo9Var.w && oo9Var.P != null && bq9Var == null) {
                    oo9Var.V = new bq9(oo9Var.e, oo9Var.f, oo9Var.k(), new no9(oo9Var));
                    cq9 cq9Var = new cq9();
                    oo9Var.W = cq9Var;
                    lo9 lo9Var = oo9Var.Q;
                    if (lo9Var != null) {
                        CopyOnWriteArrayList copyOnWriteArrayList = cq9Var.a;
                        if (!copyOnWriteArrayList.contains(lo9Var)) {
                            copyOnWriteArrayList.add(lo9Var);
                        }
                    }
                    oo9Var.V.l(oo9Var.W, null);
                    bq9 bq9Var2 = oo9Var.V;
                    float f = oo9Var.H;
                    bq9Var2.getClass();
                    bq9Var2.b.post(new ku(bq9Var2, f, (byte) 5));
                    oo9Var.V.k(a.o());
                    bq9 bq9Var3 = oo9Var.V;
                    bq9Var3.getClass();
                    bq9Var3.b.post(new ro9(bq9Var3, (byte) 3));
                    return;
                } else {
                    return;
                }
        }
    }
}
