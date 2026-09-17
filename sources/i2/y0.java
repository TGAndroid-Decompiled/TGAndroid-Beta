package i2;

import android.util.Pair;
public final class y0 implements Runnable {
    public final int f11806a;
    public final c1 f11807b;
    public final Pair f11808c;
    public final u2.b0 d;

    public y0(c1 c1Var, Pair pair, u2.b0 b0Var, int i10) {
        this.f11806a = i10;
        this.f11807b = c1Var;
        this.f11808c = pair;
        this.d = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f11806a) {
            case 0:
                j2.f fVar = this.f11807b.f11499b.h;
                Pair pair = this.f11808c;
                int intValue = ((Integer) pair.first).intValue();
                u2.f0 f0Var = (u2.f0) pair.second;
                f0Var.getClass();
                fVar.c(intValue, f0Var, this.d);
                return;
            default:
                j2.f fVar2 = this.f11807b.f11499b.h;
                Pair pair2 = this.f11808c;
                fVar2.d(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, this.d);
                return;
        }
    }
}
