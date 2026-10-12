package ae;
public abstract class b0 extends jd.a implements jd.e {
    public static final a0 f429b = new a0(jd.d.f14125a, z.f526b);

    public b0() {
        super(jd.d.f14125a);
    }

    public abstract void c(jd.h hVar, Runnable runnable);

    public boolean e() {
        return !(this instanceof h2);
    }

    @Override
    public final jd.f get(jd.g key) {
        jd.f fVar;
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof a0) {
            a0 a0Var = (a0) key;
            jd.g gVar = this.f14122a;
            if ((gVar != a0Var && a0Var.f426b != gVar) || (fVar = (jd.f) a0Var.f425a.invoke(this)) == null) {
                return null;
            }
            return fVar;
        } else if (jd.d.f14125a != key) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public final jd.h minusKey(jd.g r3) {
        throw new UnsupportedOperationException("Method not decompiled: ae.b0.minusKey(jd.g):jd.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + g0.k(this);
    }
}
