package b3;

import a8.b8;
import h2.l0;
import h9.i0;
import l2.z;
import x2.g0;
public final class b implements Runnable {
    public final int f2863a;
    public final int f2864b;
    public final long f2865c;
    public final long d;
    public final Object f2866e;

    public b(Object obj, int i7, long j3, long j10, int i10) {
        this.f2863a = i10;
        this.f2866e = obj;
        this.f2864b = i7;
        this.f2865c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        g0 g0Var;
        int i7 = this.f2863a;
        Object obj = this.f2866e;
        switch (i7) {
            case 0:
                m2.d dVar = ((c) obj).f2868b;
                b8 b8Var = dVar.d;
                if (((i0) b8Var.f342b).isEmpty()) {
                    g0Var = null;
                } else {
                    g0Var = (g0) h9.o.n((i0) b8Var.f342b);
                }
                m2.a S = dVar.S(g0Var);
                dVar.V(S, 1006, new c4.n(S, this.f2864b, this.f2865c, this.d));
                return;
            default:
                String str = l0.f13786a;
                m2.d dVar2 = ((z) ((n2.s) ((k8.a) obj).f18184c)).f19600a.f19347s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1011, new m2.c(U, this.f2864b, this.f2865c, this.d));
                return;
        }
    }
}
