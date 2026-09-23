package i2;

import android.util.Pair;
public final class b1 implements Runnable {
    public final int f10612a;
    public final d1 f10613b;
    public final Pair f10614c;
    public final u2.t d;
    public final u2.b0 e;

    public b1(d1 d1Var, Pair pair, u2.t tVar, u2.b0 b0Var, int i10) {
        this.f10612a = i10;
        this.f10613b = d1Var;
        this.f10614c = pair;
        this.d = tVar;
        this.e = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f10612a) {
            case 0:
                j2.f fVar = this.f10613b.f10626b.h;
                Pair pair = this.f10614c;
                fVar.j(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.d, this.e);
                return;
            default:
                j2.f fVar2 = this.f10613b.f10626b.h;
                Pair pair2 = this.f10614c;
                fVar2.e(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, this.d, this.e);
                return;
        }
    }
}
