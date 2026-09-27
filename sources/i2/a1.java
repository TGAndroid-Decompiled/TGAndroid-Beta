package i2;

import android.util.Pair;
public final class a1 implements Runnable {
    public final int f10607a;
    public final d1 f10608b;
    public final Pair f10609c;

    public a1(d1 d1Var, Pair pair, int i10) {
        this.f10607a = i10;
        this.f10608b = d1Var;
        this.f10609c = pair;
    }

    @Override
    public final void run() {
        switch (this.f10607a) {
            case 0:
                j2.f fVar = this.f10608b.f10629b.h;
                Pair pair = this.f10609c;
                fVar.k(((Integer) pair.first).intValue(), (u2.f0) pair.second);
                return;
            case 1:
                j2.f fVar2 = this.f10608b.f10629b.h;
                Pair pair2 = this.f10609c;
                fVar2.g(((Integer) pair2.first).intValue(), (u2.f0) pair2.second);
                return;
            default:
                j2.f fVar3 = this.f10608b.f10629b.h;
                Pair pair3 = this.f10609c;
                fVar3.i(((Integer) pair3.first).intValue(), (u2.f0) pair3.second);
                return;
        }
    }
}
