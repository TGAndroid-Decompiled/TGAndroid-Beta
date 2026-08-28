package hd;
public abstract class a0 extends qc.a implements qc.e {
    public static final z f10409b = new z(qc.d.f46139a, y.f10507b);

    public a0() {
        super(qc.d.f46139a);
    }

    public abstract void c(qc.h hVar, Runnable runnable);

    public boolean e() {
        return !(this instanceof g2);
    }

    @Override
    public final qc.f get(qc.g key) {
        qc.f fVar;
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof z) {
            z zVar = (z) key;
            qc.g gVar = this.f46136a;
            if ((gVar != zVar && zVar.f10509b != gVar) || (fVar = (qc.f) zVar.f10508a.invoke(this)) == null) {
                return null;
            }
            return fVar;
        } else if (qc.d.f46139a != key) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public final qc.h minusKey(qc.g r3) {
        throw new UnsupportedOperationException("Method not decompiled: hd.a0.minusKey(qc.g):qc.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + f0.k(this);
    }
}
