package j4;

import h3.p2;
import h3.r2;
import h3.s2;

public final class u extends n {

    public static final Object f12683e = new Object();

    public final Object f12684c;
    public final Object d;

    public u(s2 s2Var, Object obj, Object obj2) {
        super(s2Var);
        this.f12684c = obj;
        this.d = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (f12683e.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.f12623b.b(obj);
    }

    @Override
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        this.f12623b.f(i10, p2Var, z10);
        if (d5.g0.a(p2Var.f8068b, this.d) && z10) {
            p2Var.f8068b = f12683e;
        }
        return p2Var;
    }

    @Override
    public final Object l(int i10) {
        Object objL = this.f12623b.l(i10);
        return d5.g0.a(objL, this.d) ? f12683e : objL;
    }

    @Override
    public final r2 m(int i10, r2 r2Var, long j10) {
        this.f12623b.m(i10, r2Var, j10);
        if (d5.g0.a(r2Var.f8112a, this.f12684c)) {
            r2Var.f8112a = r2.D;
        }
        return r2Var;
    }
}
