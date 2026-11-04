package k2;

import android.util.Pair;
public final class c1 implements Runnable {
    public final int f16460a;
    public final f1 f16461b;
    public final Pair f16462c;
    public final w2.c0 d;

    public c1(f1 f1Var, Pair pair, w2.c0 c0Var, int i3) {
        this.f16460a = i3;
        this.f16461b = f1Var;
        this.f16462c = pair;
        this.d = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f16460a) {
            case 0:
                l2.f fVar = this.f16461b.f16503b.h;
                Pair pair = this.f16462c;
                int intValue = ((Integer) pair.first).intValue();
                w2.g0 g0Var = (w2.g0) pair.second;
                g0Var.getClass();
                fVar.D(intValue, g0Var, this.d);
                return;
            default:
                l2.f fVar2 = this.f16461b.f16503b.h;
                Pair pair2 = this.f16462c;
                fVar2.d(((Integer) pair2.first).intValue(), (w2.g0) pair2.second, this.d);
                return;
        }
    }
}
