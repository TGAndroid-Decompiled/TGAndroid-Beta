package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.ns;
public final class q8 implements Runnable {
    public final int f9281a;
    public final s8 f9282b;

    public q8(s8 s8Var, int i7) {
        this.f9281a = i7;
        this.f9282b = s8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9281a;
        s8 s8Var = this.f9282b;
        switch (i7) {
            case 0:
                s8Var.b();
                return;
            case 1:
                s8Var.a();
                return;
            default:
                org.telegram.ui.Components.xb xbVar = s8Var.d;
                u8 u8Var = s8Var.f9403q;
                q8 q8Var = s8Var.f9402p;
                gj gjVar = s8Var.f9390b;
                if (!s8Var.f9398l) {
                    s8Var.f9398l = true;
                    gjVar.f((int) s8Var.f9397k, s8Var.c(), true);
                    long j3 = u8Var.f9534g;
                    int i10 = u8Var.f9529a;
                    u8Var.f9534g = j3 + s8Var.f9397k;
                    ns.f(i10).k(221, new Object[0]);
                    s8Var.f9397k = 0L;
                    ns.f(i10).k(103, Long.valueOf(gj.B0(gjVar.f23819k)), Integer.valueOf(gjVar.e1()), gjVar.f23819k.reactions);
                }
                if (!s8Var.f9399m) {
                    s8Var.f9399m = true;
                    s8Var.f9393f.f38604b = 5000L;
                    org.telegram.messenger.g0.r(q8Var);
                    org.telegram.messenger.g0.i3(q8Var, 5000L);
                    xbVar.k(true);
                    xbVar.v = q8Var;
                }
                s8Var.f9392e.f38939b.setText(s8Var.d());
                return;
        }
    }
}
