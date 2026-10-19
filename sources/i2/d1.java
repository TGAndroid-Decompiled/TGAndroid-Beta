package i2;

import android.util.Pair;
public final class d1 implements Runnable {
    public final int f12333a;
    public final f1 f12334b;
    public final Pair f12335c;
    public final u2.u d;
    public final u2.c0 e;

    public d1(f1 f1Var, Pair pair, u2.u uVar, u2.c0 c0Var, int i10) {
        this.f12333a = i10;
        this.f12334b = f1Var;
        this.f12335c = pair;
        this.d = uVar;
        this.e = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f12333a) {
            case 0:
                j2.f fVar = this.f12334b.f12353b.h;
                Pair pair = this.f12335c;
                fVar.k(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.d, this.e);
                return;
            default:
                j2.f fVar2 = this.f12334b.f12353b.h;
                Pair pair2 = this.f12335c;
                fVar2.f(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d, this.e);
                return;
        }
    }
}
