package id;

public abstract class a0 extends rc.a implements rc.e {

    public static final z f11118b = new z(rc.d.f46898a, y.f11216b);

    public a0() {
        super(rc.d.f46898a);
    }

    public abstract void c(rc.h hVar, Runnable runnable);

    public boolean e() {
        return !(this instanceof g2);
    }

    @Override
    public final rc.f get(rc.g key) {
        rc.f fVar;
        kotlin.jvm.internal.j.e(key, "key");
        if (!(key instanceof z)) {
            if (rc.d.f46898a == key) {
                return this;
            }
            return null;
        }
        z zVar = (z) key;
        rc.g gVar = this.f46895a;
        if ((gVar == zVar || zVar.f11218b == gVar) && (fVar = (rc.f) zVar.f11217a.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    @Override
    public final rc.h minusKey(rc.g r3) {
        throw new UnsupportedOperationException("Method not decompiled: id.a0.minusKey(rc.g):rc.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + f0.k(this);
    }
}
