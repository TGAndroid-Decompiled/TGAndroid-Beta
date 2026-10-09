package i2;

import android.util.Pair;
public final class a1 implements Runnable {
    public final int f11607a;
    public final d1 f11608b;
    public final Pair f11609c;

    public a1(d1 d1Var, Pair pair, int i10) {
        this.f11607a = i10;
        this.f11608b = d1Var;
        this.f11609c = pair;
    }

    @Override
    public final void run() {
        switch (this.f11607a) {
            case 0:
                j2.f fVar = this.f11608b.f11631b.h;
                Pair pair = this.f11609c;
                fVar.k(((Integer) pair.first).intValue(), (u2.f0) pair.second);
                return;
            case 1:
                j2.f fVar2 = this.f11608b.f11631b.h;
                Pair pair2 = this.f11609c;
                fVar2.g(((Integer) pair2.first).intValue(), (u2.f0) pair2.second);
                return;
            default:
                j2.f fVar3 = this.f11608b.f11631b.h;
                Pair pair3 = this.f11609c;
                fVar3.i(((Integer) pair3.first).intValue(), (u2.f0) pair3.second);
                return;
        }
    }
}
