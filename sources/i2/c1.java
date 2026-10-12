package i2;

import android.util.Pair;
public final class c1 implements Runnable {
    public final int f10931a;
    public final g1 f10932b;
    public final Pair f10933c;
    public final u2.c0 d;

    public c1(g1 g1Var, Pair pair, u2.c0 c0Var, int i10) {
        this.f10931a = i10;
        this.f10932b = g1Var;
        this.f10933c = pair;
        this.d = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f10931a) {
            case 0:
                j2.f fVar = this.f10932b.f10977b.h;
                Pair pair = this.f10933c;
                int intValue = ((Integer) pair.first).intValue();
                u2.g0 g0Var = (u2.g0) pair.second;
                g0Var.getClass();
                fVar.d(intValue, g0Var, this.d);
                return;
            default:
                j2.f fVar2 = this.f10932b.f10977b.h;
                Pair pair2 = this.f10933c;
                fVar2.e(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d);
                return;
        }
    }
}
