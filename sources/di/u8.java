package di;

import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
public final class u8 implements Runnable {
    public final int f9874a;
    public final w8 f9875b;

    public u8(w8 w8Var, int i7) {
        this.f9874a = i7;
        this.f9875b = w8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9874a;
        w8 w8Var = this.f9875b;
        switch (i7) {
            case 0:
                w8Var.b();
                return;
            case 1:
                w8Var.a();
                return;
            default:
                org.telegram.ui.Components.fc fcVar = w8Var.d;
                y8 y8Var = w8Var.f9971q;
                u8 u8Var = w8Var.f9970p;
                fj fjVar = w8Var.f9958b;
                if (!w8Var.f9966l) {
                    w8Var.f9966l = true;
                    fjVar.f((int) w8Var.f9965k, w8Var.c(), true);
                    long j3 = y8Var.f10051g;
                    int i10 = y8Var.f10046a;
                    y8Var.f10051g = j3 + w8Var.f9965k;
                    ks.f(i10).k(223, new Object[0]);
                    w8Var.f9965k = 0L;
                    ks.f(i10).k(103, Long.valueOf(fj.B0(fjVar.f24073k)), Integer.valueOf(fjVar.e1()), fjVar.f24073k.reactions);
                }
                if (!w8Var.f9967m) {
                    w8Var.f9967m = true;
                    w8Var.f9961f.f42399b = 5000L;
                    org.telegram.messenger.g0.r(u8Var);
                    org.telegram.messenger.g0.h3(u8Var, 5000L);
                    fcVar.k(true);
                    fcVar.v = u8Var;
                }
                w8Var.f9960e.f42811b.setText(w8Var.d());
                return;
        }
    }
}
