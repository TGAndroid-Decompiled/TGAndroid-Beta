package i2;

import android.util.Pair;
public final class z0 implements Runnable {
    public final int f10928a;
    public final c1 f10929b;
    public final Pair f10930c;

    public z0(c1 c1Var, Pair pair, int i10) {
        this.f10928a = i10;
        this.f10929b = c1Var;
        this.f10930c = pair;
    }

    @Override
    public final void run() {
        switch (this.f10928a) {
            case 0:
                j2.f fVar = this.f10929b.f10634b.h;
                Pair pair = this.f10930c;
                fVar.k(((Integer) pair.first).intValue(), (u2.f0) pair.second);
                return;
            case 1:
                j2.f fVar2 = this.f10929b.f10634b.h;
                Pair pair2 = this.f10930c;
                fVar2.g(((Integer) pair2.first).intValue(), (u2.f0) pair2.second);
                return;
            default:
                j2.f fVar3 = this.f10929b.f10634b.h;
                Pair pair3 = this.f10930c;
                fVar3.i(((Integer) pair3.first).intValue(), (u2.f0) pair3.second);
                return;
        }
    }
}
