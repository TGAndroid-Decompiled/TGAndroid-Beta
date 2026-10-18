package i2;

import android.util.Pair;
public final class c1 implements Runnable {
    public final int f12332a;
    public final e1 f12333b;
    public final Pair f12334c;
    public final u2.t d;
    public final u2.b0 e;

    public c1(e1 e1Var, Pair pair, u2.t tVar, u2.b0 b0Var, int i10) {
        this.f12332a = i10;
        this.f12333b = e1Var;
        this.f12334c = pair;
        this.d = tVar;
        this.e = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f12332a) {
            case 0:
                j2.f fVar = this.f12333b.f12352b.h;
                Pair pair = this.f12334c;
                fVar.k(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.d, this.e);
                return;
            default:
                j2.f fVar2 = this.f12333b.f12352b.h;
                Pair pair2 = this.f12334c;
                fVar2.f(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, this.d, this.e);
                return;
        }
    }
}
