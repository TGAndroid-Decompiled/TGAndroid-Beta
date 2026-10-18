package i2;

import android.util.Pair;
public final class c1 implements Runnable {
    public final int f12330a;
    public final e1 f12331b;
    public final Pair f12332c;
    public final u2.u d;
    public final u2.c0 e;

    public c1(e1 e1Var, Pair pair, u2.u uVar, u2.c0 c0Var, int i10) {
        this.f12330a = i10;
        this.f12331b = e1Var;
        this.f12332c = pair;
        this.d = uVar;
        this.e = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f12330a) {
            case 0:
                j2.f fVar = this.f12331b.f12350b.h;
                Pair pair = this.f12332c;
                fVar.k(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.d, this.e);
                return;
            default:
                j2.f fVar2 = this.f12331b.f12350b.h;
                Pair pair2 = this.f12332c;
                fVar2.f(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d, this.e);
                return;
        }
    }
}
