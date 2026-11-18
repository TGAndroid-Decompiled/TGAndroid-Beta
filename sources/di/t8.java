package di;

import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
public final class t8 implements Runnable {
    public final int f9817a;
    public final v8 f9818b;

    public t8(v8 v8Var, int i7) {
        this.f9817a = i7;
        this.f9818b = v8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9817a;
        v8 v8Var = this.f9818b;
        switch (i7) {
            case 0:
                v8Var.b();
                return;
            case 1:
                v8Var.a();
                return;
            default:
                org.telegram.ui.Components.gc gcVar = v8Var.d;
                x8 x8Var = v8Var.f9945q;
                t8 t8Var = v8Var.f9944p;
                fj fjVar = v8Var.f9932b;
                if (!v8Var.f9940l) {
                    v8Var.f9940l = true;
                    fjVar.f((int) v8Var.f9939k, v8Var.c(), true);
                    long j3 = x8Var.f10020g;
                    int i10 = x8Var.f10015a;
                    x8Var.f10020g = j3 + v8Var.f9939k;
                    ks.f(i10).k(223, new Object[0]);
                    v8Var.f9939k = 0L;
                    ks.f(i10).k(103, Long.valueOf(fj.B0(fjVar.f23965k)), Integer.valueOf(fjVar.e1()), fjVar.f23965k.reactions);
                }
                if (!v8Var.f9941m) {
                    v8Var.f9941m = true;
                    v8Var.f9935f.f42849b = 5000L;
                    org.telegram.messenger.g0.r(t8Var);
                    org.telegram.messenger.g0.h3(t8Var, 5000L);
                    gcVar.k(true);
                    gcVar.v = t8Var;
                }
                v8Var.f9934e.f33328b.setText(v8Var.d());
                return;
        }
    }
}
