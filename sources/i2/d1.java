package i2;

import android.util.Pair;
public final class d1 implements Runnable {
    public final int f13510a;
    public final g1 f13511b;
    public final Pair f13512c;
    public final u2.c0 d;

    public d1(g1 g1Var, Pair pair, u2.c0 c0Var, int i10) {
        this.f13510a = i10;
        this.f13511b = g1Var;
        this.f13512c = pair;
        this.d = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f13510a) {
            case 0:
                j2.e eVar = this.f13511b.f13549b.h;
                Pair pair = this.f13512c;
                int intValue = ((Integer) pair.first).intValue();
                u2.g0 g0Var = (u2.g0) pair.second;
                g0Var.getClass();
                eVar.c(intValue, g0Var, this.d);
                return;
            default:
                j2.e eVar2 = this.f13511b.f13549b.h;
                Pair pair2 = this.f13512c;
                eVar2.d(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d);
                return;
        }
    }
}
