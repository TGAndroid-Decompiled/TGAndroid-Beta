package ld;
public abstract class a0 extends uc.a implements uc.e {
    public static final z f11968b = new z(uc.d.f45280a, y.f12048b);

    public a0() {
        super(uc.d.f45280a);
    }

    public abstract void c(uc.h hVar, Runnable runnable);

    public boolean e() {
        return !(this instanceof f2);
    }

    @Override
    public final uc.f get(uc.g key) {
        uc.f fVar;
        kotlin.jvm.internal.j.e(key, "key");
        if (key instanceof z) {
            z zVar = (z) key;
            uc.g gVar = this.f45277a;
            if ((gVar != zVar && zVar.f12051b != gVar) || (fVar = (uc.f) zVar.f12050a.invoke(this)) == null) {
                return null;
            }
            return fVar;
        } else if (uc.d.f45280a != key) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public final uc.h minusKey(uc.g r3) {
        throw new UnsupportedOperationException("Method not decompiled: ld.a0.minusKey(uc.g):uc.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + e0.k(this);
    }
}
