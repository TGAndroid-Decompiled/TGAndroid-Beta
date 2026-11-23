package l2;

import android.util.Pair;
public final class a1 implements Runnable {
    public final int f19343a;
    public final d1 f19344b;
    public final Pair f19345c;
    public final x2.c0 d;

    public a1(d1 d1Var, Pair pair, x2.c0 c0Var, int i7) {
        this.f19343a = i7;
        this.f19344b = d1Var;
        this.f19345c = pair;
        this.d = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f19343a) {
            case 0:
                m2.d dVar = this.f19344b.f19374b.h;
                Pair pair = this.f19345c;
                int intValue = ((Integer) pair.first).intValue();
                x2.g0 g0Var = (x2.g0) pair.second;
                g0Var.getClass();
                dVar.C(intValue, g0Var, this.d);
                return;
            default:
                m2.d dVar2 = this.f19344b.f19374b.h;
                Pair pair2 = this.f19345c;
                dVar2.i(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, this.d);
                return;
        }
    }
}
