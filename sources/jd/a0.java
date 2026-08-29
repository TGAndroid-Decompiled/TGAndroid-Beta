package jd;
public abstract class a0 extends sc.a implements sc.e {
    public static final z f11444b = new z(sc.d.f47710a, y.f11541b);

    public a0() {
        super(sc.d.f47710a);
    }

    public abstract void c(sc.h hVar, Runnable runnable);

    public boolean e() {
        return !(this instanceof f2);
    }

    @Override
    public final sc.f get(sc.g key) {
        sc.f fVar;
        kotlin.jvm.internal.j.e(key, "key");
        if (key instanceof z) {
            z zVar = (z) key;
            sc.g gVar = this.f47707a;
            if ((gVar != zVar && zVar.f11544b != gVar) || (fVar = (sc.f) zVar.f11543a.invoke(this)) == null) {
                return null;
            }
            return fVar;
        } else if (sc.d.f47710a != key) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public final sc.h minusKey(sc.g r3) {
        throw new UnsupportedOperationException("Method not decompiled: jd.a0.minusKey(sc.g):sc.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + e0.k(this);
    }
}
