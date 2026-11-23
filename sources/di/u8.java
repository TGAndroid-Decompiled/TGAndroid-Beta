package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
public final class u8 implements Runnable {
    public final int f9879a;
    public final w8 f9880b;

    public u8(w8 w8Var, int i7) {
        this.f9879a = i7;
        this.f9880b = w8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9879a;
        w8 w8Var = this.f9880b;
        switch (i7) {
            case 0:
                w8Var.b();
                return;
            case 1:
                w8Var.a();
                return;
            default:
                org.telegram.ui.Components.gc gcVar = w8Var.d;
                y8 y8Var = w8Var.f9973q;
                u8 u8Var = w8Var.f9972p;
                gj gjVar = w8Var.f9960b;
                if (!w8Var.f9968l) {
                    w8Var.f9968l = true;
                    gjVar.f((int) w8Var.f9967k, w8Var.c(), true);
                    long j3 = y8Var.f10053g;
                    int i10 = y8Var.f10048a;
                    y8Var.f10053g = j3 + w8Var.f9967k;
                    ls.f(i10).k(223, new Object[0]);
                    w8Var.f9967k = 0L;
                    ls.f(i10).k(103, Long.valueOf(gj.B0(gjVar.f24177k)), Integer.valueOf(gjVar.e1()), gjVar.f24177k.reactions);
                }
                if (!w8Var.f9969m) {
                    w8Var.f9969m = true;
                    w8Var.f9963f.f42723b = 5000L;
                    org.telegram.messenger.g0.r(u8Var);
                    org.telegram.messenger.g0.h3(u8Var, 5000L);
                    gcVar.k(true);
                    gcVar.v = u8Var;
                }
                w8Var.f9962e.f33453b.setText(w8Var.d());
                return;
        }
    }
}
