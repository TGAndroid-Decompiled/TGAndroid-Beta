package b3;

import a8.b8;
import h2.l0;
import h9.i0;
import l2.z;
import x2.f0;
public final class b implements Runnable {
    public final int f2872a;
    public final int f2873b;
    public final long f2874c;
    public final long d;
    public final Object f2875e;

    public b(Object obj, int i7, long j3, long j10, int i10) {
        this.f2872a = i10;
        this.f2875e = obj;
        this.f2873b = i7;
        this.f2874c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        f0 f0Var;
        int i7 = this.f2872a;
        Object obj = this.f2875e;
        switch (i7) {
            case 0:
                m2.e eVar = ((c) obj).f2877b;
                b8 b8Var = eVar.d;
                if (((i0) b8Var.f342b).isEmpty()) {
                    f0Var = null;
                } else {
                    f0Var = (f0) h9.o.n((i0) b8Var.f342b);
                }
                m2.a S = eVar.S(f0Var);
                eVar.V(S, 1006, new c4.n(S, this.f2873b, this.f2874c, this.d));
                return;
            default:
                String str = l0.f13471a;
                m2.e eVar2 = ((z) ((n2.s) ((k8.a) obj).f17789c)).f19233a.f18980s;
                m2.a U = eVar2.U();
                eVar2.V(U, 1011, new m2.c(U, this.f2873b, this.f2874c, this.d));
                return;
        }
    }
}
