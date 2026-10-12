package i2;

import android.util.Pair;
public final class d1 implements Runnable {
    public final int f10937a;
    public final g1 f10938b;
    public final Pair f10939c;
    public final u2.u d;
    public final u2.c0 e;

    public d1(g1 g1Var, Pair pair, u2.u uVar, u2.c0 c0Var, int i10) {
        this.f10937a = i10;
        this.f10938b = g1Var;
        this.f10939c = pair;
        this.d = uVar;
        this.e = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f10937a) {
            case 0:
                j2.f fVar = this.f10938b.f10977b.h;
                Pair pair = this.f10939c;
                fVar.k(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.d, this.e);
                return;
            default:
                j2.f fVar2 = this.f10938b.f10977b.h;
                Pair pair2 = this.f10939c;
                fVar2.f(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d, this.e);
                return;
        }
    }
}
