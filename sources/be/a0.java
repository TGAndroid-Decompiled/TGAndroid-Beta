package be;
public abstract class a0 extends kd.a implements kd.e {
    public static final z f2645b = new z(kd.d.f14225a, y.f2726b);

    public a0() {
        super(kd.d.f14225a);
    }

    public abstract void c(kd.h hVar, Runnable runnable);

    public boolean d() {
        return !(this instanceof g2);
    }

    @Override
    public final kd.f get(kd.g key) {
        kd.f fVar;
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof z) {
            z zVar = (z) key;
            kd.g gVar = this.f14222a;
            if ((gVar != zVar && zVar.f2728b != gVar) || (fVar = (kd.f) zVar.f2727a.invoke(this)) == null) {
                return null;
            }
            return fVar;
        } else if (kd.d.f14225a != key) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public final kd.h minusKey(kd.g r3) {
        throw new UnsupportedOperationException("Method not decompiled: be.a0.minusKey(kd.g):kd.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + f0.k(this);
    }
}
