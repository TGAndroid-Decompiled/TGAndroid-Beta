package i2;

import android.util.Pair;
public final class b1 implements Runnable {
    public final int f12323a;
    public final e1 f12324b;
    public final Pair f12325c;
    public final u2.c0 d;

    public b1(e1 e1Var, Pair pair, u2.c0 c0Var, int i10) {
        this.f12323a = i10;
        this.f12324b = e1Var;
        this.f12325c = pair;
        this.d = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f12323a) {
            case 0:
                j2.f fVar = this.f12324b.f12350b.h;
                Pair pair = this.f12325c;
                int intValue = ((Integer) pair.first).intValue();
                u2.g0 g0Var = (u2.g0) pair.second;
                g0Var.getClass();
                fVar.d(intValue, g0Var, this.d);
                return;
            default:
                j2.f fVar2 = this.f12324b.f12350b.h;
                Pair pair2 = this.f12325c;
                fVar2.e(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d);
                return;
        }
    }
}
