package o4;

import j3.m2;
import j3.n2;
import j3.o2;
public final class o extends h {
    public static final Object e = new Object();
    public final Object f16370c;
    public final Object d;

    public o(o2 o2Var, Object obj, Object obj2) {
        super(o2Var);
        this.f16370c = obj;
        this.d = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (e.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.f16328b.b(obj);
    }

    @Override
    public final m2 f(int i10, m2 m2Var, boolean z4) {
        this.f16328b.f(i10, m2Var, z4);
        if (h5.d0.a(m2Var.f8685b, this.d) && z4) {
            m2Var.f8685b = e;
        }
        return m2Var;
    }

    @Override
    public final Object l(int i10) {
        Object l10 = this.f16328b.l(i10);
        if (h5.d0.a(l10, this.d)) {
            return e;
        }
        return l10;
    }

    @Override
    public final n2 m(int i10, n2 n2Var, long j10) {
        this.f16328b.m(i10, n2Var, j10);
        if (h5.d0.a(n2Var.f8731a, this.f16370c)) {
            n2Var.f8731a = n2.E;
        }
        return n2Var;
    }
}
