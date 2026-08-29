package j3;

import android.util.Pair;
public final class o1 implements Runnable {
    public final int f10657a;
    public final g9.l f10658b;
    public final Pair f10659c;
    public final l4.x d;

    public o1(g9.l lVar, Pair pair, l4.x xVar, int i10) {
        this.f10657a = i10;
        this.f10658b = lVar;
        this.f10659c = pair;
        this.d = xVar;
    }

    @Override
    public final void run() {
        switch (this.f10657a) {
            case 0:
                k3.f fVar = ((s1) this.f10658b.f7169c).h;
                Pair pair = this.f10659c;
                fVar.c(((Integer) pair.first).intValue(), (l4.c0) pair.second, this.d);
                return;
            default:
                k3.f fVar2 = ((s1) this.f10658b.f7169c).h;
                Pair pair2 = this.f10659c;
                int intValue = ((Integer) pair2.first).intValue();
                l4.c0 c0Var = (l4.c0) pair2.second;
                c0Var.getClass();
                fVar2.b(intValue, c0Var, this.d);
                return;
        }
    }
}
