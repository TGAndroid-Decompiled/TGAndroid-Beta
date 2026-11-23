package l2;

import android.util.Pair;
public final class a1 implements Runnable {
    public final int f19279a;
    public final c1 f19280b;
    public final Pair f19281c;
    public final x2.u d;
    public final x2.c0 f19282e;

    public a1(c1 c1Var, Pair pair, x2.u uVar, x2.c0 c0Var, int i7) {
        this.f19279a = i7;
        this.f19280b = c1Var;
        this.f19281c = pair;
        this.d = uVar;
        this.f19282e = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f19279a) {
            case 0:
                m2.d dVar = this.f19280b.f19304b.h;
                Pair pair = this.f19281c;
                dVar.A(((Integer) pair.first).intValue(), (x2.g0) pair.second, this.d, this.f19282e);
                return;
            default:
                m2.d dVar2 = this.f19280b.f19304b.h;
                Pair pair2 = this.f19281c;
                dVar2.G(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, this.d, this.f19282e);
                return;
        }
    }
}
