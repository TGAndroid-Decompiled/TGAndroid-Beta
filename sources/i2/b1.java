package i2;

import android.util.Pair;
public final class b1 implements Runnable {
    public final int f11614a;
    public final d1 f11615b;
    public final Pair f11616c;
    public final u2.t d;
    public final u2.b0 f11617e;

    public b1(d1 d1Var, Pair pair, u2.t tVar, u2.b0 b0Var, int i10) {
        this.f11614a = i10;
        this.f11615b = d1Var;
        this.f11616c = pair;
        this.d = tVar;
        this.f11617e = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f11614a) {
            case 0:
                j2.f fVar = this.f11615b.f11630b.h;
                Pair pair = this.f11616c;
                fVar.j(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.d, this.f11617e);
                return;
            default:
                j2.f fVar2 = this.f11615b.f11630b.h;
                Pair pair2 = this.f11616c;
                fVar2.e(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, this.d, this.f11617e);
                return;
        }
    }
}
