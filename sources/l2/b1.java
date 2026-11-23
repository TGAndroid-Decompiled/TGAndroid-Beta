package l2;

import android.util.Pair;
public final class b1 implements Runnable {
    public final int f19359a;
    public final d1 f19360b;
    public final Pair f19361c;
    public final x2.u d;
    public final x2.c0 f19362e;

    public b1(d1 d1Var, Pair pair, x2.u uVar, x2.c0 c0Var, int i7) {
        this.f19359a = i7;
        this.f19360b = d1Var;
        this.f19361c = pair;
        this.d = uVar;
        this.f19362e = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f19359a) {
            case 0:
                m2.d dVar = this.f19360b.f19374b.h;
                Pair pair = this.f19361c;
                dVar.A(((Integer) pair.first).intValue(), (x2.g0) pair.second, this.d, this.f19362e);
                return;
            default:
                m2.d dVar2 = this.f19360b.f19374b.h;
                Pair pair2 = this.f19361c;
                dVar2.G(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, this.d, this.f19362e);
                return;
        }
    }
}
