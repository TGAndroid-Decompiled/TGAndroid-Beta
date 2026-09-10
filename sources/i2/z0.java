package i2;

import android.util.Pair;
public final class z0 implements Runnable {
    public final int f10408a;
    public final b1 f10409b;
    public final Pair f10410c;
    public final u2.u d;
    public final u2.c0 e;

    public z0(b1 b1Var, Pair pair, u2.u uVar, u2.c0 c0Var, int i10) {
        this.f10408a = i10;
        this.f10409b = b1Var;
        this.f10410c = pair;
        this.d = uVar;
        this.e = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f10408a) {
            case 0:
                j2.e eVar = this.f10409b.f10110b.h;
                Pair pair = this.f10410c;
                eVar.j(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.d, this.e);
                return;
            default:
                j2.e eVar2 = this.f10409b.f10110b.h;
                Pair pair2 = this.f10410c;
                eVar2.e(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d, this.e);
                return;
        }
    }
}
