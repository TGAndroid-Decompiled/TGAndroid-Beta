package b3;

import a8.b8;
import h2.l0;
import h9.i0;
import l2.z;
import x2.g0;
public final class b implements Runnable {
    public final int f2834a;
    public final int f2835b;
    public final long f2836c;
    public final long d;
    public final Object f2837e;

    public b(Object obj, int i7, long j3, long j10, int i10) {
        this.f2834a = i10;
        this.f2837e = obj;
        this.f2835b = i7;
        this.f2836c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        g0 g0Var;
        int i7 = this.f2834a;
        Object obj = this.f2837e;
        switch (i7) {
            case 0:
                m2.d dVar = ((c) obj).f2839b;
                b8 b8Var = dVar.d;
                if (((i0) b8Var.f342b).isEmpty()) {
                    g0Var = null;
                } else {
                    g0Var = (g0) h9.o.n((i0) b8Var.f342b);
                }
                m2.a S = dVar.S(g0Var);
                dVar.V(S, 1006, new c4.n(S, this.f2835b, this.f2836c, this.d));
                return;
            default:
                String str = l0.f13778a;
                m2.d dVar2 = ((z) ((n2.s) ((k8.a) obj).f18178c)).f19594a.f19341s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1011, new m2.c(U, this.f2835b, this.f2836c, this.d));
                return;
        }
    }
}
