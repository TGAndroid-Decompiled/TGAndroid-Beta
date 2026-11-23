package l2;

import android.util.Pair;
public final class a1 implements Runnable {
    public final int f19245a;
    public final c1 f19246b;
    public final Pair f19247c;
    public final x2.u d;
    public final x2.c0 f19248e;

    public a1(c1 c1Var, Pair pair, x2.u uVar, x2.c0 c0Var, int i7) {
        this.f19245a = i7;
        this.f19246b = c1Var;
        this.f19247c = pair;
        this.d = uVar;
        this.f19248e = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f19245a) {
            case 0:
                m2.d dVar = this.f19246b.f19270b.h;
                Pair pair = this.f19247c;
                dVar.A(((Integer) pair.first).intValue(), (x2.g0) pair.second, this.d, this.f19248e);
                return;
            default:
                m2.d dVar2 = this.f19246b.f19270b.h;
                Pair pair2 = this.f19247c;
                dVar2.G(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, this.d, this.f19248e);
                return;
        }
    }
}
