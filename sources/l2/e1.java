package l2;

import android.util.Pair;
public final class e1 implements Runnable {
    public final int f17796a;
    public final g1 f17797b;
    public final Pair f17798c;
    public final x2.u d;
    public final x2.c0 f17799e;

    public e1(g1 g1Var, Pair pair, x2.u uVar, x2.c0 c0Var, int i7) {
        this.f17796a = i7;
        this.f17797b = g1Var;
        this.f17798c = pair;
        this.d = uVar;
        this.f17799e = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f17796a) {
            case 0:
                m2.e eVar = this.f17797b.f17822b.h;
                Pair pair = this.f17798c;
                eVar.A(((Integer) pair.first).intValue(), (x2.g0) pair.second, this.d, this.f17799e);
                return;
            default:
                m2.e eVar2 = this.f17797b.f17822b.h;
                Pair pair2 = this.f17798c;
                eVar2.G(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, this.d, this.f17799e);
                return;
        }
    }
}
