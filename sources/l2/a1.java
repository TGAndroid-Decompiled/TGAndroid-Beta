package l2;

import android.util.Pair;
public final class a1 implements Runnable {
    public final int f19248a;
    public final c1 f19249b;
    public final Pair f19250c;
    public final x2.u d;
    public final x2.c0 f19251e;

    public a1(c1 c1Var, Pair pair, x2.u uVar, x2.c0 c0Var, int i7) {
        this.f19248a = i7;
        this.f19249b = c1Var;
        this.f19250c = pair;
        this.d = uVar;
        this.f19251e = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f19248a) {
            case 0:
                m2.d dVar = this.f19249b.f19273b.h;
                Pair pair = this.f19250c;
                dVar.A(((Integer) pair.first).intValue(), (x2.g0) pair.second, this.d, this.f19251e);
                return;
            default:
                m2.d dVar2 = this.f19249b.f19273b.h;
                Pair pair2 = this.f19250c;
                dVar2.G(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, this.d, this.f19251e);
                return;
        }
    }
}
