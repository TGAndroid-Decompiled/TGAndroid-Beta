package defpackage;

import j$.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.a;
public final class gm9 implements Runnable {
    public final byte a;
    public final nm9 b;

    public gm9(nm9 nm9Var, byte b) {
        this.a = b;
        this.b = nm9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nm9 nm9Var = this.b;
        switch (b) {
            case 0:
                nm9Var.C(true);
                return;
            case 1:
                nm9Var.C(true);
                return;
            default:
                ao9 ao9Var = nm9Var.V;
                if (ao9Var != null && nm9Var.X) {
                    nm9Var.X = false;
                    pz0 pz0Var = ao9Var.e;
                    Objects.requireNonNull(pz0Var);
                    ao9Var.b.post(new yy0(pz0Var, (byte) 7));
                    return;
                } else if (!nm9Var.w && nm9Var.P != null && ao9Var == null) {
                    nm9Var.V = new ao9(nm9Var.e, nm9Var.f, nm9Var.k(), new mm9(nm9Var));
                    bo9 bo9Var = new bo9();
                    nm9Var.W = bo9Var;
                    km9 km9Var = nm9Var.Q;
                    if (km9Var != null) {
                        CopyOnWriteArrayList copyOnWriteArrayList = bo9Var.a;
                        if (!copyOnWriteArrayList.contains(km9Var)) {
                            copyOnWriteArrayList.add(km9Var);
                        }
                    }
                    nm9Var.V.l(nm9Var.W, null);
                    ao9 ao9Var2 = nm9Var.V;
                    float f = nm9Var.H;
                    ao9Var2.getClass();
                    ao9Var2.b.post(new kt(ao9Var2, f, (byte) 5));
                    nm9Var.V.k(a.o());
                    ao9 ao9Var3 = nm9Var.V;
                    ao9Var3.getClass();
                    ao9Var3.b.post(new qm9(ao9Var3, (byte) 3));
                    return;
                } else {
                    return;
                }
        }
    }
}
