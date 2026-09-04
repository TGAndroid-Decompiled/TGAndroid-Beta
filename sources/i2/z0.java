package i2;

import android.util.Pair;
public final class z0 implements Runnable {
    public final int f11785a;
    public final c1 f11786b;
    public final Pair f11787c;

    public z0(c1 c1Var, Pair pair, int i10) {
        this.f11785a = i10;
        this.f11786b = c1Var;
        this.f11787c = pair;
    }

    @Override
    public final void run() {
        switch (this.f11785a) {
            case 0:
                j2.f fVar = this.f11786b.f11473b.h;
                Pair pair = this.f11787c;
                fVar.k(((Integer) pair.first).intValue(), (u2.f0) pair.second);
                return;
            case 1:
                j2.f fVar2 = this.f11786b.f11473b.h;
                Pair pair2 = this.f11787c;
                fVar2.g(((Integer) pair2.first).intValue(), (u2.f0) pair2.second);
                return;
            default:
                j2.f fVar3 = this.f11786b.f11473b.h;
                Pair pair3 = this.f11787c;
                fVar3.i(((Integer) pair3.first).intValue(), (u2.f0) pair3.second);
                return;
        }
    }
}
