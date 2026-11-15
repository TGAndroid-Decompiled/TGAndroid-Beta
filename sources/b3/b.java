package b3;

import a8.b8;
import h2.l0;
import h9.i0;
import l2.z;
import x2.f0;
public final class b implements Runnable {
    public final int f2869a;
    public final int f2870b;
    public final long f2871c;
    public final long d;
    public final Object f2872e;

    public b(Object obj, int i7, long j3, long j10, int i10) {
        this.f2869a = i10;
        this.f2872e = obj;
        this.f2870b = i7;
        this.f2871c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        f0 f0Var;
        int i7 = this.f2869a;
        Object obj = this.f2872e;
        switch (i7) {
            case 0:
                m2.e eVar = ((c) obj).f2874b;
                b8 b8Var = eVar.d;
                if (((i0) b8Var.f342b).isEmpty()) {
                    f0Var = null;
                } else {
                    f0Var = (f0) h9.o.n((i0) b8Var.f342b);
                }
                m2.a S = eVar.S(f0Var);
                eVar.V(S, 1006, new c4.n(S, this.f2870b, this.f2871c, this.d));
                return;
            default:
                String str = l0.f13471a;
                m2.e eVar2 = ((z) ((n2.s) ((k8.a) obj).f17789c)).f19233a.f18980s;
                m2.a U = eVar2.U();
                eVar2.V(U, 1011, new m2.c(U, this.f2870b, this.f2871c, this.d));
                return;
        }
    }
}
