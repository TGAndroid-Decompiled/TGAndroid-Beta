package nh;

import android.os.SystemClock;
public final class k6 implements Runnable {
    public final int f18006a;
    public final o6 f18007b;

    public k6(o6 o6Var, int i10) {
        this.f18006a = i10;
        this.f18007b = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f18006a) {
            case 0:
                o6 o6Var = this.f18007b;
                o6Var.f18236n0 = false;
                o6Var.f18246v0 = false;
                o6Var.f18241r0 = SystemClock.elapsedRealtime();
                o6Var.f18239q0 = true;
                o6Var.f18243s0 = false;
                o6Var.F.c(false);
                o6Var.G.c(false);
                o6Var.H.c(false);
                ((ca) o6Var.f18218a).d(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                o6 o6Var2 = this.f18007b;
                o6Var2.M = currentTimeMillis;
                o6Var2.N = 0L;
                o6Var2.f18236n0 = true;
                ((ca) o6Var2.f18218a).f17486a.F0.a(0L, true);
                return;
            case 2:
                o6 o6Var3 = this.f18007b;
                if (!o6Var3.f18236n0 && !o6Var3.b()) {
                    if (!gb.d(((ca) o6Var3.f18218a).f17486a)) {
                        o6Var3.f18243s0 = false;
                        o6Var3.F.c(false);
                        o6Var3.G.c(false);
                        o6Var3.H.c(false);
                        return;
                    }
                    o6Var3.f18246v0 = true;
                    o6Var3.f18248w0 = true;
                    ((ca) o6Var3.f18218a).e(new k6(o6Var3, 4), true);
                    return;
                }
                return;
            case 3:
                o6 o6Var4 = this.f18007b;
                if (!o6Var4.f18236n0 && !o6Var4.b()) {
                    ka kaVar = ((ca) o6Var4.f18218a).f17486a.f17812x0;
                    if (kaVar != null) {
                        kaVar.toggleDual();
                    }
                    o6Var4.d(360.0f);
                    o6Var4.f18243s0 = false;
                    o6Var4.F.c(false);
                    o6Var4.G.c(false);
                    o6Var4.H.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                o6 o6Var5 = this.f18007b;
                o6Var5.M = currentTimeMillis2;
                o6Var5.f18236n0 = true;
                l6 l6Var = o6Var5.f18218a;
                o6Var5.N = 0L;
                ((ca) l6Var).f17486a.F0.a(0L, true);
                return;
        }
    }
}
