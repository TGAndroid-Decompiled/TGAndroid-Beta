package l2;

import android.util.Pair;
public final class z0 implements Runnable {
    public final int f19234a;
    public final c1 f19235b;
    public final Pair f19236c;
    public final x2.b0 d;

    public z0(c1 c1Var, Pair pair, x2.b0 b0Var, int i7) {
        this.f19234a = i7;
        this.f19235b = c1Var;
        this.f19236c = pair;
        this.d = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f19234a) {
            case 0:
                m2.e eVar = this.f19235b.f18909b.h;
                Pair pair = this.f19236c;
                int intValue = ((Integer) pair.first).intValue();
                x2.f0 f0Var = (x2.f0) pair.second;
                f0Var.getClass();
                eVar.C(intValue, f0Var, this.d);
                return;
            default:
                m2.e eVar2 = this.f19235b.f18909b.h;
                Pair pair2 = this.f19236c;
                eVar2.k(((Integer) pair2.first).intValue(), (x2.f0) pair2.second, this.d);
                return;
        }
    }
}
