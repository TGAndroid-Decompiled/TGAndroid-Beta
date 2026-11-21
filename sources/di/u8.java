package di;

import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
public final class u8 implements Runnable {
    public final int f9910a;
    public final w8 f9911b;

    public u8(w8 w8Var, int i7) {
        this.f9910a = i7;
        this.f9911b = w8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9910a;
        w8 w8Var = this.f9911b;
        switch (i7) {
            case 0:
                w8Var.b();
                return;
            case 1:
                w8Var.a();
                return;
            default:
                org.telegram.ui.Components.gc gcVar = w8Var.d;
                y8 y8Var = w8Var.f10007q;
                u8 u8Var = w8Var.f10006p;
                fj fjVar = w8Var.f9994b;
                if (!w8Var.f10002l) {
                    w8Var.f10002l = true;
                    fjVar.f((int) w8Var.f10001k, w8Var.c(), true);
                    long j3 = y8Var.f10087g;
                    int i10 = y8Var.f10082a;
                    y8Var.f10087g = j3 + w8Var.f10001k;
                    ks.f(i10).k(223, new Object[0]);
                    w8Var.f10001k = 0L;
                    ks.f(i10).k(103, Long.valueOf(fj.B0(fjVar.f23993k)), Integer.valueOf(fjVar.e1()), fjVar.f23993k.reactions);
                }
                if (!w8Var.f10003m) {
                    w8Var.f10003m = true;
                    w8Var.f9997f.f42762b = 5000L;
                    org.telegram.messenger.g0.r(u8Var);
                    org.telegram.messenger.g0.h3(u8Var, 5000L);
                    gcVar.k(true);
                    gcVar.v = u8Var;
                }
                w8Var.f9996e.f33474b.setText(w8Var.d());
                return;
        }
    }
}
