package i2;

import android.util.Pair;
public final class z0 implements Runnable {
    public final int f10926a;
    public final c1 f10927b;
    public final Pair f10928c;

    public z0(c1 c1Var, Pair pair, int i10) {
        this.f10926a = i10;
        this.f10927b = c1Var;
        this.f10928c = pair;
    }

    @Override
    public final void run() {
        switch (this.f10926a) {
            case 0:
                j2.f fVar = this.f10927b.f10632b.h;
                Pair pair = this.f10928c;
                fVar.k(((Integer) pair.first).intValue(), (u2.f0) pair.second);
                return;
            case 1:
                j2.f fVar2 = this.f10927b.f10632b.h;
                Pair pair2 = this.f10928c;
                fVar2.g(((Integer) pair2.first).intValue(), (u2.f0) pair2.second);
                return;
            default:
                j2.f fVar3 = this.f10927b.f10632b.h;
                Pair pair3 = this.f10928c;
                fVar3.i(((Integer) pair3.first).intValue(), (u2.f0) pair3.second);
                return;
        }
    }
}
