package ae;
public abstract class b0 extends jd.a implements jd.e {
    public static final a0 f427b = new a0(jd.d.f14128a, z.f524b);

    public b0() {
        super(jd.d.f14128a);
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
            jd.g gVar = this.f14125a;
            if ((gVar != a0Var && a0Var.f424b != gVar) || (fVar = (jd.f) a0Var.f423a.invoke(this)) == null) {
                return null;
            }
            return fVar;
        } else if (jd.d.f14128a != key) {
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
