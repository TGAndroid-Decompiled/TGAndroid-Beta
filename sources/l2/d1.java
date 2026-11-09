package l2;

import android.util.Pair;
public final class d1 implements Runnable {
    public final int f17786a;
    public final g1 f17787b;
    public final Pair f17788c;
    public final x2.c0 d;

    public d1(g1 g1Var, Pair pair, x2.c0 c0Var, int i7) {
        this.f17786a = i7;
        this.f17787b = g1Var;
        this.f17788c = pair;
        this.d = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f17786a) {
            case 0:
                m2.e eVar = this.f17787b.f17822b.h;
                Pair pair = this.f17788c;
                int intValue = ((Integer) pair.first).intValue();
                x2.g0 g0Var = (x2.g0) pair.second;
                g0Var.getClass();
                eVar.E(intValue, g0Var, this.d);
                return;
            default:
                m2.e eVar2 = this.f17787b.f17822b.h;
                Pair pair2 = this.f17788c;
                eVar2.d(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, this.d);
                return;
        }
    }
}
