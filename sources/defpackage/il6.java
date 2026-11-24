package defpackage;

import j$.util.Objects;
public final class il6 extends to4 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public il6(bqb bqbVar, Object obj, Object obj2) {
        super(bqbVar);
        this.f = obj;
        this.g = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (h == obj && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override
    public final ypb f(int i, ypb ypbVar, boolean z) {
        this.e.f(i, ypbVar, z);
        if (Objects.equals(ypbVar.b, this.g) && z) {
            ypbVar.b = h;
        }
        return ypbVar;
    }

    @Override
    public final Object l(int i) {
        Object l = this.e.l(i);
        if (Objects.equals(l, this.g)) {
            return h;
        }
        return l;
    }

    @Override
    public final aqb m(int i, aqb aqbVar, long j) {
        this.e.m(i, aqbVar, j);
        if (Objects.equals(aqbVar.a, this.f)) {
            aqbVar.a = aqb.p;
        }
        return aqbVar;
    }
}
