package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.ns;
public final class r8 implements Runnable {
    public final int f9345a;
    public final t8 f9346b;

    public r8(t8 t8Var, int i7) {
        this.f9345a = i7;
        this.f9346b = t8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9345a;
        t8 t8Var = this.f9346b;
        switch (i7) {
            case 0:
                t8Var.b();
                return;
            case 1:
                t8Var.a();
                return;
            default:
                org.telegram.ui.Components.xb xbVar = t8Var.d;
                v8 v8Var = t8Var.f9489q;
                r8 r8Var = t8Var.f9488p;
                gj gjVar = t8Var.f9476b;
                if (!t8Var.f9484l) {
                    t8Var.f9484l = true;
                    gjVar.f((int) t8Var.f9483k, t8Var.c(), true);
                    long j3 = v8Var.f9603g;
                    int i10 = v8Var.f9598a;
                    v8Var.f9603g = j3 + t8Var.f9483k;
                    ns.f(i10).k(221, new Object[0]);
                    t8Var.f9483k = 0L;
                    ns.f(i10).k(103, Long.valueOf(gj.B0(gjVar.f23817k)), Integer.valueOf(gjVar.e1()), gjVar.f23817k.reactions);
                }
                if (!t8Var.f9485m) {
                    t8Var.f9485m = true;
                    t8Var.f9479f.f38606b = 5000L;
                    org.telegram.messenger.g0.r(r8Var);
                    org.telegram.messenger.g0.i3(r8Var, 5000L);
                    xbVar.k(true);
                    xbVar.v = r8Var;
                }
                t8Var.f9478e.f38942b.setText(t8Var.d());
                return;
        }
    }
}
