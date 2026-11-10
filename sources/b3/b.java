package b3;

import a8.b8;
import h2.m0;
import h9.i0;
import l2.c0;
import x2.f0;
public final class b implements Runnable {
    public final int f2915a;
    public final int f2916b;
    public final long f2917c;
    public final long d;
    public final Object f2918e;

    public b(Object obj, int i7, long j3, long j10, int i10) {
        this.f2915a = i10;
        this.f2918e = obj;
        this.f2916b = i7;
        this.f2917c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        f0 f0Var;
        int i7 = this.f2915a;
        Object obj = this.f2918e;
        switch (i7) {
            case 0:
                m2.e eVar = ((c) obj).f2920b;
                b8 b8Var = eVar.d;
                if (((i0) b8Var.f336b).isEmpty()) {
                    f0Var = null;
                } else {
                    f0Var = (f0) h9.o.n((i0) b8Var.f336b);
                }
                m2.a S = eVar.S(f0Var);
                eVar.V(S, 1006, new c4.n(S, this.f2916b, this.f2917c, this.d));
                return;
            default:
                String str = m0.f14114a;
                m2.e eVar2 = ((c0) ((n2.s) ((j2.n) obj).f16457c)).f17775a.f17885s;
                m2.a U = eVar2.U();
                eVar2.V(U, 1011, new m2.d(U, this.f2916b, this.f2917c, this.d));
                return;
        }
    }
}
