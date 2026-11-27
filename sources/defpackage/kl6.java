package defpackage;

import j$.util.Objects;
public final class kl6 extends xo4 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public kl6(asb asbVar, Object obj, Object obj2) {
        super(asbVar);
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
    public final xrb f(int i, xrb xrbVar, boolean z) {
        this.e.f(i, xrbVar, z);
        if (Objects.equals(xrbVar.b, this.g) && z) {
            xrbVar.b = h;
        }
        return xrbVar;
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
    public final zrb m(int i, zrb zrbVar, long j) {
        this.e.m(i, zrbVar, j);
        if (Objects.equals(zrbVar.a, this.f)) {
            zrbVar.a = zrb.p;
        }
        return zrbVar;
    }
}
