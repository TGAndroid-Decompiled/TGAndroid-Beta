package l2;

import android.util.Pair;
public final class e1 implements Runnable {
    public final int f17799a;
    public final g1 f17800b;
    public final Pair f17801c;
    public final x2.t d;
    public final x2.b0 f17802e;

    public e1(g1 g1Var, Pair pair, x2.t tVar, x2.b0 b0Var, int i7) {
        this.f17799a = i7;
        this.f17800b = g1Var;
        this.f17801c = pair;
        this.d = tVar;
        this.f17802e = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f17799a) {
            case 0:
                m2.e eVar = this.f17800b.f17825b.h;
                Pair pair = this.f17801c;
                eVar.A(((Integer) pair.first).intValue(), (x2.f0) pair.second, this.d, this.f17802e);
                return;
            default:
                m2.e eVar2 = this.f17800b.f17825b.h;
                Pair pair2 = this.f17801c;
                eVar2.G(((Integer) pair2.first).intValue(), (x2.f0) pair2.second, this.d, this.f17802e);
                return;
        }
    }
}
