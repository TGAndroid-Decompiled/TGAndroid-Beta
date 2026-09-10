package i2;

import android.util.Pair;
public final class y0 implements Runnable {
    public final int f10402a;
    public final b1 f10403b;
    public final Pair f10404c;

    public y0(b1 b1Var, Pair pair, int i10) {
        this.f10402a = i10;
        this.f10403b = b1Var;
        this.f10404c = pair;
    }

    @Override
    public final void run() {
        switch (this.f10402a) {
            case 0:
                j2.e eVar = this.f10403b.f10110b.h;
                Pair pair = this.f10404c;
                eVar.k(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                return;
            case 1:
                j2.e eVar2 = this.f10403b.f10110b.h;
                Pair pair2 = this.f10404c;
                eVar2.g(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                return;
            default:
                j2.e eVar3 = this.f10403b.f10110b.h;
                Pair pair3 = this.f10404c;
                eVar3.i(((Integer) pair3.first).intValue(), (u2.g0) pair3.second);
                return;
        }
    }
}
