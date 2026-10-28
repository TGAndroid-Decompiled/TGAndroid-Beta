package i2;

import android.util.Pair;
public final class e1 implements Runnable {
    public final int f13523a;
    public final g1 f13524b;
    public final Pair f13525c;
    public final u2.u d;
    public final u2.c0 e;

    public e1(g1 g1Var, Pair pair, u2.u uVar, u2.c0 c0Var, int i10) {
        this.f13523a = i10;
        this.f13524b = g1Var;
        this.f13525c = pair;
        this.d = uVar;
        this.e = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f13523a) {
            case 0:
                j2.e eVar = this.f13524b.f13548b.h;
                Pair pair = this.f13525c;
                eVar.j(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.d, this.e);
                return;
            default:
                j2.e eVar2 = this.f13524b.f13548b.h;
                Pair pair2 = this.f13525c;
                eVar2.e(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d, this.e);
                return;
        }
    }
}
