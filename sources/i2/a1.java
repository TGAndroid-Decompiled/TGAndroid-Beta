package i2;

import android.util.Pair;
public final class a1 implements Runnable {
    public final int f11456a;
    public final c1 f11457b;
    public final Pair f11458c;
    public final u2.t d;
    public final u2.b0 f11459e;

    public a1(c1 c1Var, Pair pair, u2.t tVar, u2.b0 b0Var, int i10) {
        this.f11456a = i10;
        this.f11457b = c1Var;
        this.f11458c = pair;
        this.d = tVar;
        this.f11459e = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f11456a) {
            case 0:
                j2.f fVar = this.f11457b.f11473b.h;
                Pair pair = this.f11458c;
                fVar.j(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.d, this.f11459e);
                return;
            default:
                j2.f fVar2 = this.f11457b.f11473b.h;
                Pair pair2 = this.f11458c;
                fVar2.e(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, this.d, this.f11459e);
                return;
        }
    }
}
