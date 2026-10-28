package ce;
public abstract class a0 extends ld.a implements ld.e {
    public static final z f6201b = new z(ld.d.f16986a, y.f6282b);

    public a0() {
        super(ld.d.f16986a);
    }

    public abstract void c(ld.h hVar, Runnable runnable);

    public boolean d() {
        return !(this instanceof g2);
    }

    @Override
    public final ld.f get(ld.g key) {
        ld.f fVar;
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof z) {
            z zVar = (z) key;
            ld.g gVar = this.f16983a;
            if ((gVar != zVar && zVar.f6284b != gVar) || (fVar = (ld.f) zVar.f6283a.invoke(this)) == null) {
                return null;
            }
            return fVar;
        } else if (ld.d.f16986a != key) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public final ld.h minusKey(ld.g r3) {
        throw new UnsupportedOperationException("Method not decompiled: ce.a0.minusKey(ld.g):ld.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + f0.k(this);
    }
}
