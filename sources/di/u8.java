package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
public final class u8 implements Runnable {
    public final int f9913a;
    public final w8 f9914b;

    public u8(w8 w8Var, int i7) {
        this.f9913a = i7;
        this.f9914b = w8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9913a;
        w8 w8Var = this.f9914b;
        switch (i7) {
            case 0:
                w8Var.b();
                return;
            case 1:
                w8Var.a();
                return;
            default:
                org.telegram.ui.Components.gc gcVar = w8Var.d;
                y8 y8Var = w8Var.f10010q;
                u8 u8Var = w8Var.f10009p;
                gj gjVar = w8Var.f9997b;
                if (!w8Var.f10005l) {
                    w8Var.f10005l = true;
                    gjVar.f((int) w8Var.f10004k, w8Var.c(), true);
                    long j3 = y8Var.f10090g;
                    int i10 = y8Var.f10085a;
                    y8Var.f10090g = j3 + w8Var.f10004k;
                    ls.f(i10).k(223, new Object[0]);
                    w8Var.f10004k = 0L;
                    ls.f(i10).k(103, Long.valueOf(gj.B0(gjVar.f24213k)), Integer.valueOf(gjVar.e1()), gjVar.f24213k.reactions);
                }
                if (!w8Var.f10006m) {
                    w8Var.f10006m = true;
                    w8Var.f10000f.f42765b = 5000L;
                    org.telegram.messenger.g0.r(u8Var);
                    org.telegram.messenger.g0.h3(u8Var, 5000L);
                    gcVar.k(true);
                    gcVar.v = u8Var;
                }
                w8Var.f9999e.f33487b.setText(w8Var.d());
                return;
        }
    }
}
