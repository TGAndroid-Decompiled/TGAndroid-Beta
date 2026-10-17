package i2;

import android.util.Pair;
public final class b1 implements Runnable {
    public final int f12325a;
    public final e1 f12326b;
    public final Pair f12327c;
    public final u2.u d;
    public final u2.c0 e;

    public b1(e1 e1Var, Pair pair, u2.u uVar, u2.c0 c0Var, int i10) {
        this.f12325a = i10;
        this.f12326b = e1Var;
        this.f12327c = pair;
        this.d = uVar;
        this.e = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f12325a) {
            case 0:
                j2.f fVar = this.f12326b.f12356b.h;
                Pair pair = this.f12327c;
                fVar.k(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.d, this.e);
                return;
            default:
                j2.f fVar2 = this.f12326b.f12356b.h;
                Pair pair2 = this.f12327c;
                fVar2.f(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d, this.e);
                return;
        }
    }
}
