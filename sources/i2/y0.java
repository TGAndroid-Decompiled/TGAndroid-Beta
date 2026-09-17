package i2;

import android.util.Pair;
public final class y0 implements Runnable {
    public final int f10921a;
    public final c1 f10922b;
    public final Pair f10923c;
    public final u2.b0 d;

    public y0(c1 c1Var, Pair pair, u2.b0 b0Var, int i10) {
        this.f10921a = i10;
        this.f10922b = c1Var;
        this.f10923c = pair;
        this.d = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f10921a) {
            case 0:
                j2.f fVar = this.f10922b.f10633b.h;
                Pair pair = this.f10923c;
                int intValue = ((Integer) pair.first).intValue();
                u2.f0 f0Var = (u2.f0) pair.second;
                f0Var.getClass();
                fVar.c(intValue, f0Var, this.d);
                return;
            default:
                j2.f fVar2 = this.f10922b.f10633b.h;
                Pair pair2 = this.f10923c;
                fVar2.d(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, this.d);
                return;
        }
    }
}
