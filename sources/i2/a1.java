package i2;

import android.util.Pair;
public final class a1 implements Runnable {
    public final int f11482a;
    public final c1 f11483b;
    public final Pair f11484c;
    public final u2.t d;
    public final u2.b0 f11485e;

    public a1(c1 c1Var, Pair pair, u2.t tVar, u2.b0 b0Var, int i10) {
        this.f11482a = i10;
        this.f11483b = c1Var;
        this.f11484c = pair;
        this.d = tVar;
        this.f11485e = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f11482a) {
            case 0:
                j2.f fVar = this.f11483b.f11499b.h;
                Pair pair = this.f11484c;
                fVar.j(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.d, this.f11485e);
                return;
            default:
                j2.f fVar2 = this.f11483b.f11499b.h;
                Pair pair2 = this.f11484c;
                fVar2.e(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, this.d, this.f11485e);
                return;
        }
    }
}
