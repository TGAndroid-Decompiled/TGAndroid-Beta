package l4;

import j3.p2;
import j3.q2;
import j3.r2;
public final class u extends n {
    public static final Object f14433e = new Object();
    public final Object f14434c;
    public final Object d;

    public u(r2 r2Var, Object obj, Object obj2) {
        super(r2Var);
        this.f14434c = obj;
        this.d = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (f14433e.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.f14382b.b(obj);
    }

    @Override
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        this.f14382b.f(i10, p2Var, z10);
        if (f5.d0.a(p2Var.f10675b, this.d) && z10) {
            p2Var.f10675b = f14433e;
        }
        return p2Var;
    }

    @Override
    public final Object l(int i10) {
        Object l10 = this.f14382b.l(i10);
        if (f5.d0.a(l10, this.d)) {
            return f14433e;
        }
        return l10;
    }

    @Override
    public final q2 m(int i10, q2 q2Var, long j10) {
        this.f14382b.m(i10, q2Var, j10);
        if (f5.d0.a(q2Var.f10695a, this.f14434c)) {
            q2Var.f10695a = q2.D;
        }
        return q2Var;
    }
}
