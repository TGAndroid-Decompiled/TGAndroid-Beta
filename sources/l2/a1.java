package l2;

import android.util.Pair;
public final class a1 implements Runnable {
    public final int f18884a;
    public final c1 f18885b;
    public final Pair f18886c;
    public final x2.t d;
    public final x2.b0 f18887e;

    public a1(c1 c1Var, Pair pair, x2.t tVar, x2.b0 b0Var, int i7) {
        this.f18884a = i7;
        this.f18885b = c1Var;
        this.f18886c = pair;
        this.d = tVar;
        this.f18887e = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f18884a) {
            case 0:
                m2.e eVar = this.f18885b.f18909b.h;
                Pair pair = this.f18886c;
                eVar.A(((Integer) pair.first).intValue(), (x2.f0) pair.second, this.d, this.f18887e);
                return;
            default:
                m2.e eVar2 = this.f18885b.f18909b.h;
                Pair pair2 = this.f18886c;
                eVar2.G(((Integer) pair2.first).intValue(), (x2.f0) pair2.second, this.d, this.f18887e);
                return;
        }
    }
}
