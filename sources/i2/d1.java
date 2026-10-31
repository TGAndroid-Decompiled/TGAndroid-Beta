package i2;

import android.util.Pair;
public final class d1 implements Runnable {
    public final int f7834a;
    public final i1 f7835b;
    public final Pair f7836c;
    public final u2.c0 d;

    public d1(i1 i1Var, Pair pair, u2.c0 c0Var, int i10) {
        this.f7834a = i10;
        this.f7835b = i1Var;
        this.f7836c = pair;
        this.d = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f7834a) {
            case 0:
                j2.g gVar = this.f7835b.f7937b.h;
                Pair pair = this.f7836c;
                int intValue = ((Integer) pair.first).intValue();
                u2.g0 g0Var = (u2.g0) pair.second;
                g0Var.getClass();
                gVar.n(intValue, g0Var, this.d);
                return;
            default:
                j2.g gVar2 = this.f7835b.f7937b.h;
                Pair pair2 = this.f7836c;
                gVar2.r(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d);
                return;
        }
    }
}
