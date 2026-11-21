package l2;

import android.util.Pair;
public final class a1 implements Runnable {
    public final int f19276a;
    public final c1 f19277b;
    public final Pair f19278c;
    public final x2.u d;
    public final x2.c0 f19279e;

    public a1(c1 c1Var, Pair pair, x2.u uVar, x2.c0 c0Var, int i7) {
        this.f19276a = i7;
        this.f19277b = c1Var;
        this.f19278c = pair;
        this.d = uVar;
        this.f19279e = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f19276a) {
            case 0:
                m2.d dVar = this.f19277b.f19301b.h;
                Pair pair = this.f19278c;
                dVar.A(((Integer) pair.first).intValue(), (x2.g0) pair.second, this.d, this.f19279e);
                return;
            default:
                m2.d dVar2 = this.f19277b.f19301b.h;
                Pair pair2 = this.f19278c;
                dVar2.G(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, this.d, this.f19279e);
                return;
        }
    }
}
