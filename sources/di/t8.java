package di;

import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
public final class t8 implements Runnable {
    public final int f9820a;
    public final v8 f9821b;

    public t8(v8 v8Var, int i7) {
        this.f9820a = i7;
        this.f9821b = v8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9820a;
        v8 v8Var = this.f9821b;
        switch (i7) {
            case 0:
                v8Var.b();
                return;
            case 1:
                v8Var.a();
                return;
            default:
                org.telegram.ui.Components.gc gcVar = v8Var.d;
                x8 x8Var = v8Var.f9948q;
                t8 t8Var = v8Var.f9947p;
                fj fjVar = v8Var.f9935b;
                if (!v8Var.f9943l) {
                    v8Var.f9943l = true;
                    fjVar.f((int) v8Var.f9942k, v8Var.c(), true);
                    long j3 = x8Var.f10023g;
                    int i10 = x8Var.f10018a;
                    x8Var.f10023g = j3 + v8Var.f9942k;
                    ks.f(i10).k(223, new Object[0]);
                    v8Var.f9942k = 0L;
                    ks.f(i10).k(103, Long.valueOf(fj.B0(fjVar.f23968k)), Integer.valueOf(fjVar.e1()), fjVar.f23968k.reactions);
                }
                if (!v8Var.f9944m) {
                    v8Var.f9944m = true;
                    v8Var.f9938f.f42849b = 5000L;
                    org.telegram.messenger.g0.r(t8Var);
                    org.telegram.messenger.g0.h3(t8Var, 5000L);
                    gcVar.k(true);
                    gcVar.v = t8Var;
                }
                v8Var.f9937e.f33328b.setText(v8Var.d());
                return;
        }
    }
}
