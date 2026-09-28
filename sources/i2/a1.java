package i2;

import android.util.Pair;
public final class a1 implements Runnable {
    public final int f10604a;
    public final d1 f10605b;
    public final Pair f10606c;

    public a1(d1 d1Var, Pair pair, int i10) {
        this.f10604a = i10;
        this.f10605b = d1Var;
        this.f10606c = pair;
    }

    @Override
    public final void run() {
        switch (this.f10604a) {
            case 0:
                j2.f fVar = this.f10605b.f10626b.h;
                Pair pair = this.f10606c;
                fVar.k(((Integer) pair.first).intValue(), (u2.f0) pair.second);
                return;
            case 1:
                j2.f fVar2 = this.f10605b.f10626b.h;
                Pair pair2 = this.f10606c;
                fVar2.g(((Integer) pair2.first).intValue(), (u2.f0) pair2.second);
                return;
            default:
                j2.f fVar3 = this.f10605b.f10626b.h;
                Pair pair3 = this.f10606c;
                fVar3.i(((Integer) pair3.first).intValue(), (u2.f0) pair3.second);
                return;
        }
    }
}
