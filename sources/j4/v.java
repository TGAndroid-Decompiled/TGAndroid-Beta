package j4;

import h3.p2;
import h3.q2;
import h3.r2;
public final class v extends o {
    public static final Object f13586e = new Object();
    public final Object f13587c;
    public final Object d;

    public v(r2 r2Var, Object obj, Object obj2) {
        super(r2Var);
        this.f13587c = obj;
        this.d = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (f13586e.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.f13526b.b(obj);
    }

    @Override
    public final p2 f(int i9, p2 p2Var, boolean z10) {
        this.f13526b.f(i9, p2Var, z10);
        if (d5.f0.a(p2Var.f9638b, this.d) && z10) {
            p2Var.f9638b = f13586e;
        }
        return p2Var;
    }

    @Override
    public final Object l(int i9) {
        Object l10 = this.f13526b.l(i9);
        if (d5.f0.a(l10, this.d)) {
            return f13586e;
        }
        return l10;
    }

    @Override
    public final q2 m(int i9, q2 q2Var, long j10) {
        this.f13526b.m(i9, q2Var, j10);
        if (d5.f0.a(q2Var.f9658a, this.f13587c)) {
            q2Var.f9658a = q2.D;
        }
        return q2Var;
    }
}
