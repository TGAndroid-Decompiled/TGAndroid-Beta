package i2;

import android.util.Pair;
public final class z0 implements Runnable {
    public final int f11939a;
    public final d1 f11940b;
    public final Pair f11941c;
    public final u2.b0 d;

    public z0(d1 d1Var, Pair pair, u2.b0 b0Var, int i10) {
        this.f11939a = i10;
        this.f11940b = d1Var;
        this.f11941c = pair;
        this.d = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f11939a) {
            case 0:
                j2.f fVar = this.f11940b.f11630b.h;
                Pair pair = this.f11941c;
                int intValue = ((Integer) pair.first).intValue();
                u2.f0 f0Var = (u2.f0) pair.second;
                f0Var.getClass();
                fVar.c(intValue, f0Var, this.d);
                return;
            default:
                j2.f fVar2 = this.f11940b.f11630b.h;
                Pair pair2 = this.f11941c;
                fVar2.d(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, this.d);
                return;
        }
    }
}
