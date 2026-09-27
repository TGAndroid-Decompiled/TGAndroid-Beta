package i2;

import android.util.Pair;
public final class z0 implements Runnable {
    public final int f10917a;
    public final d1 f10918b;
    public final Pair f10919c;
    public final u2.b0 d;

    public z0(d1 d1Var, Pair pair, u2.b0 b0Var, int i10) {
        this.f10917a = i10;
        this.f10918b = d1Var;
        this.f10919c = pair;
        this.d = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f10917a) {
            case 0:
                j2.f fVar = this.f10918b.f10629b.h;
                Pair pair = this.f10919c;
                int intValue = ((Integer) pair.first).intValue();
                u2.f0 f0Var = (u2.f0) pair.second;
                f0Var.getClass();
                fVar.c(intValue, f0Var, this.d);
                return;
            default:
                j2.f fVar2 = this.f10918b.f10629b.h;
                Pair pair2 = this.f10919c;
                fVar2.d(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, this.d);
                return;
        }
    }
}
