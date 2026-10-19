package i2;

import android.util.Pair;
public final class c1 implements Runnable {
    public final int f12328a;
    public final f1 f12329b;
    public final Pair f12330c;
    public final u2.c0 d;

    public c1(f1 f1Var, Pair pair, u2.c0 c0Var, int i10) {
        this.f12328a = i10;
        this.f12329b = f1Var;
        this.f12330c = pair;
        this.d = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f12328a) {
            case 0:
                j2.f fVar = this.f12329b.f12355b.h;
                Pair pair = this.f12330c;
                int intValue = ((Integer) pair.first).intValue();
                u2.g0 g0Var = (u2.g0) pair.second;
                g0Var.getClass();
                fVar.d(intValue, g0Var, this.d);
                return;
            default:
                j2.f fVar2 = this.f12329b.f12355b.h;
                Pair pair2 = this.f12330c;
                fVar2.e(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d);
                return;
        }
    }
}
