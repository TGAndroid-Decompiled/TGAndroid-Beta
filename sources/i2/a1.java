package i2;

import android.util.Pair;
public final class a1 implements Runnable {
    public final int f11556a;
    public final d1 f11557b;
    public final Pair f11558c;

    public a1(d1 d1Var, Pair pair, int i10) {
        this.f11556a = i10;
        this.f11557b = d1Var;
        this.f11558c = pair;
    }

    @Override
    public final void run() {
        switch (this.f11556a) {
            case 0:
                j2.f fVar = this.f11557b.f11580b.h;
                Pair pair = this.f11558c;
                fVar.k(((Integer) pair.first).intValue(), (u2.f0) pair.second);
                return;
            case 1:
                j2.f fVar2 = this.f11557b.f11580b.h;
                Pair pair2 = this.f11558c;
                fVar2.g(((Integer) pair2.first).intValue(), (u2.f0) pair2.second);
                return;
            default:
                j2.f fVar3 = this.f11557b.f11580b.h;
                Pair pair3 = this.f11558c;
                fVar3.i(((Integer) pair3.first).intValue(), (u2.f0) pair3.second);
                return;
        }
    }
}
