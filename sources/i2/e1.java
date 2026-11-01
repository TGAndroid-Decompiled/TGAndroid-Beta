package i2;

import android.util.Pair;
public final class e1 implements Runnable {
    public final int f7844a;
    public final i1 f7845b;
    public final Pair f7846c;
    public final u2.u d;
    public final u2.c0 e;

    public e1(i1 i1Var, Pair pair, u2.u uVar, u2.c0 c0Var, int i10) {
        this.f7844a = i10;
        this.f7845b = i1Var;
        this.f7846c = pair;
        this.d = uVar;
        this.e = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f7844a) {
            case 0:
                j2.g gVar = this.f7845b.f7938b.h;
                Pair pair = this.f7846c;
                gVar.L(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.d, this.e);
                return;
            default:
                j2.g gVar2 = this.f7845b.f7938b.h;
                Pair pair2 = this.f7846c;
                gVar2.t(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d, this.e);
                return;
        }
    }
}
