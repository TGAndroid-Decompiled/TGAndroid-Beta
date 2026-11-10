package l2;

import android.util.Pair;
public final class d1 implements Runnable {
    public final int f17789a;
    public final g1 f17790b;
    public final Pair f17791c;
    public final x2.b0 d;

    public d1(g1 g1Var, Pair pair, x2.b0 b0Var, int i7) {
        this.f17789a = i7;
        this.f17790b = g1Var;
        this.f17791c = pair;
        this.d = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f17789a) {
            case 0:
                m2.e eVar = this.f17790b.f17825b.h;
                Pair pair = this.f17791c;
                int intValue = ((Integer) pair.first).intValue();
                x2.f0 f0Var = (x2.f0) pair.second;
                f0Var.getClass();
                eVar.E(intValue, f0Var, this.d);
                return;
            default:
                m2.e eVar2 = this.f17790b.f17825b.h;
                Pair pair2 = this.f17791c;
                eVar2.d(((Integer) pair2.first).intValue(), (x2.f0) pair2.second, this.d);
                return;
        }
    }
}
