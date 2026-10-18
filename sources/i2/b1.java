package i2;

import android.util.Pair;
public final class b1 implements Runnable {
    public final int f12325a;
    public final e1 f12326b;
    public final Pair f12327c;
    public final u2.b0 d;

    public b1(e1 e1Var, Pair pair, u2.b0 b0Var, int i10) {
        this.f12325a = i10;
        this.f12326b = e1Var;
        this.f12327c = pair;
        this.d = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f12325a) {
            case 0:
                j2.f fVar = this.f12326b.f12352b.h;
                Pair pair = this.f12327c;
                int intValue = ((Integer) pair.first).intValue();
                u2.f0 f0Var = (u2.f0) pair.second;
                f0Var.getClass();
                fVar.d(intValue, f0Var, this.d);
                return;
            default:
                j2.f fVar2 = this.f12326b.f12352b.h;
                Pair pair2 = this.f12327c;
                fVar2.e(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, this.d);
                return;
        }
    }
}
