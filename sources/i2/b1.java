package i2;

import android.util.Pair;
public final class b1 implements Runnable {
    public final int f11565a;
    public final d1 f11566b;
    public final Pair f11567c;
    public final u2.t d;
    public final u2.b0 f11568e;

    public b1(d1 d1Var, Pair pair, u2.t tVar, u2.b0 b0Var, int i10) {
        this.f11565a = i10;
        this.f11566b = d1Var;
        this.f11567c = pair;
        this.d = tVar;
        this.f11568e = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f11565a) {
            case 0:
                j2.f fVar = this.f11566b.f11581b.h;
                Pair pair = this.f11567c;
                fVar.j(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.d, this.f11568e);
                return;
            default:
                j2.f fVar2 = this.f11566b.f11581b.h;
                Pair pair2 = this.f11567c;
                fVar2.e(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, this.d, this.f11568e);
                return;
        }
    }
}
