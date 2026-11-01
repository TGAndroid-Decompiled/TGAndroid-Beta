package i2;

import android.util.Pair;
public final class d1 implements Runnable {
    public final int f7835a;
    public final i1 f7836b;
    public final Pair f7837c;
    public final u2.c0 d;

    public d1(i1 i1Var, Pair pair, u2.c0 c0Var, int i10) {
        this.f7835a = i10;
        this.f7836b = i1Var;
        this.f7837c = pair;
        this.d = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f7835a) {
            case 0:
                j2.g gVar = this.f7836b.f7938b.h;
                Pair pair = this.f7837c;
                int intValue = ((Integer) pair.first).intValue();
                u2.g0 g0Var = (u2.g0) pair.second;
                g0Var.getClass();
                gVar.n(intValue, g0Var, this.d);
                return;
            default:
                j2.g gVar2 = this.f7836b.f7938b.h;
                Pair pair2 = this.f7837c;
                gVar2.r(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d);
                return;
        }
    }
}
