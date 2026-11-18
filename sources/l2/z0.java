package l2;

import android.util.Pair;
public final class z0 implements Runnable {
    public final int f19601a;
    public final c1 f19602b;
    public final Pair f19603c;
    public final x2.c0 d;

    public z0(c1 c1Var, Pair pair, x2.c0 c0Var, int i7) {
        this.f19601a = i7;
        this.f19602b = c1Var;
        this.f19603c = pair;
        this.d = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f19601a) {
            case 0:
                m2.d dVar = this.f19602b.f19276b.h;
                Pair pair = this.f19603c;
                int intValue = ((Integer) pair.first).intValue();
                x2.g0 g0Var = (x2.g0) pair.second;
                g0Var.getClass();
                dVar.C(intValue, g0Var, this.d);
                return;
            default:
                m2.d dVar2 = this.f19602b.f19276b.h;
                Pair pair2 = this.f19603c;
                dVar2.b(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, this.d);
                return;
        }
    }
}
