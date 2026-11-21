package l2;

import android.util.Pair;
public final class z0 implements Runnable {
    public final int f19626a;
    public final c1 f19627b;
    public final Pair f19628c;
    public final x2.c0 d;

    public z0(c1 c1Var, Pair pair, x2.c0 c0Var, int i7) {
        this.f19626a = i7;
        this.f19627b = c1Var;
        this.f19628c = pair;
        this.d = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f19626a) {
            case 0:
                m2.d dVar = this.f19627b.f19301b.h;
                Pair pair = this.f19628c;
                int intValue = ((Integer) pair.first).intValue();
                x2.g0 g0Var = (x2.g0) pair.second;
                g0Var.getClass();
                dVar.C(intValue, g0Var, this.d);
                return;
            default:
                m2.d dVar2 = this.f19627b.f19301b.h;
                Pair pair2 = this.f19628c;
                dVar2.b(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, this.d);
                return;
        }
    }
}
