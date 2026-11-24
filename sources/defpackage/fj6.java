package defpackage;

import j$.util.Objects;
public final class fj6 extends sm4 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public fj6(aob aobVar, Object obj, Object obj2) {
        super(aobVar);
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
    public final xnb f(int i, xnb xnbVar, boolean z) {
        this.e.f(i, xnbVar, z);
        if (Objects.equals(xnbVar.b, this.g) && z) {
            xnbVar.b = h;
        }
        return xnbVar;
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
    public final znb m(int i, znb znbVar, long j) {
        this.e.m(i, znbVar, j);
        if (Objects.equals(znbVar.a, this.f)) {
            znbVar.a = znb.p;
        }
        return znbVar;
    }
}
