package a3;

import g2.n0;
import g9.i0;
import k2.c0;
import w2.g0;
public final class b implements Runnable {
    public final int f57a;
    public final int f58b;
    public final long f59c;
    public final long d;
    public final Object f60e;

    public b(Object obj, int i3, long j10, long j11, int i10) {
        this.f57a = i10;
        this.f60e = obj;
        this.f58b = i3;
        this.f59c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        g0 g0Var;
        int i3 = this.f57a;
        Object obj = this.f60e;
        switch (i3) {
            case 0:
                l2.f fVar = ((c) obj).f62b;
                l2.e eVar = fVar.d;
                if (((i0) eVar.f17690b).isEmpty()) {
                    g0Var = null;
                } else {
                    g0Var = (g0) g9.o.n((i0) eVar.f17690b);
                }
                l2.a S = fVar.S(g0Var);
                fVar.V(S, 1006, new b4.o(S, this.f58b, this.f59c, this.d));
                return;
            default:
                String str = n0.f11873a;
                l2.f fVar2 = ((c0) ((m2.u) ((m2.t) obj).f19007c)).f16459a.f16572s;
                l2.a U = fVar2.U();
                fVar2.V(U, 1011, new l2.d(U, this.f58b, this.f59c, this.d));
                return;
        }
    }
}
