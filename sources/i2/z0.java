package i2;

import android.util.Pair;
public final class z0 implements Runnable {
    public final int f11811a;
    public final c1 f11812b;
    public final Pair f11813c;

    public z0(c1 c1Var, Pair pair, int i10) {
        this.f11811a = i10;
        this.f11812b = c1Var;
        this.f11813c = pair;
    }

    @Override
    public final void run() {
        switch (this.f11811a) {
            case 0:
                j2.f fVar = this.f11812b.f11499b.h;
                Pair pair = this.f11813c;
                fVar.k(((Integer) pair.first).intValue(), (u2.f0) pair.second);
                return;
            case 1:
                j2.f fVar2 = this.f11812b.f11499b.h;
                Pair pair2 = this.f11813c;
                fVar2.g(((Integer) pair2.first).intValue(), (u2.f0) pair2.second);
                return;
            default:
                j2.f fVar3 = this.f11812b.f11499b.h;
                Pair pair3 = this.f11813c;
                fVar3.i(((Integer) pair3.first).intValue(), (u2.f0) pair3.second);
                return;
        }
    }
}
