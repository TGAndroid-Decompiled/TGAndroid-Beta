package i2;

import android.util.Pair;
public final class a1 implements Runnable {
    public final int f10617a;
    public final c1 f10618b;
    public final Pair f10619c;
    public final u2.t d;
    public final u2.b0 e;

    public a1(c1 c1Var, Pair pair, u2.t tVar, u2.b0 b0Var, int i10) {
        this.f10617a = i10;
        this.f10618b = c1Var;
        this.f10619c = pair;
        this.d = tVar;
        this.e = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f10617a) {
            case 0:
                j2.f fVar = this.f10618b.f10632b.h;
                Pair pair = this.f10619c;
                fVar.j(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.d, this.e);
                return;
            default:
                j2.f fVar2 = this.f10618b.f10632b.h;
                Pair pair2 = this.f10619c;
                fVar2.e(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, this.d, this.e);
                return;
        }
    }
}
