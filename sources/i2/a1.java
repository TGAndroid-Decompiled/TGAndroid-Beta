package i2;

import android.util.Pair;
public final class a1 implements Runnable {
    public final int f10619a;
    public final c1 f10620b;
    public final Pair f10621c;
    public final u2.t d;
    public final u2.b0 e;

    public a1(c1 c1Var, Pair pair, u2.t tVar, u2.b0 b0Var, int i10) {
        this.f10619a = i10;
        this.f10620b = c1Var;
        this.f10621c = pair;
        this.d = tVar;
        this.e = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f10619a) {
            case 0:
                j2.f fVar = this.f10620b.f10634b.h;
                Pair pair = this.f10621c;
                fVar.j(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.d, this.e);
                return;
            default:
                j2.f fVar2 = this.f10620b.f10634b.h;
                Pair pair2 = this.f10621c;
                fVar2.e(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, this.d, this.e);
                return;
        }
    }
}
