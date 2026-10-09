package i2;

import android.util.Pair;
public final class b1 implements Runnable {
    public final int f11615a;
    public final d1 f11616b;
    public final Pair f11617c;
    public final u2.t d;
    public final u2.b0 f11618e;

    public b1(d1 d1Var, Pair pair, u2.t tVar, u2.b0 b0Var, int i10) {
        this.f11615a = i10;
        this.f11616b = d1Var;
        this.f11617c = pair;
        this.d = tVar;
        this.f11618e = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f11615a) {
            case 0:
                j2.f fVar = this.f11616b.f11631b.h;
                Pair pair = this.f11617c;
                fVar.j(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.d, this.f11618e);
                return;
            default:
                j2.f fVar2 = this.f11616b.f11631b.h;
                Pair pair2 = this.f11617c;
                fVar2.e(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, this.d, this.f11618e);
                return;
        }
    }
}
