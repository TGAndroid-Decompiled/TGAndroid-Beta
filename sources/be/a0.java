package be;
public abstract class a0 extends kd.a implements kd.e {
    public static final z f4262b = new z(kd.d.f15029a, y.f4343b);

    public a0() {
        super(kd.d.f15029a);
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
            kd.g gVar = this.f15026a;
            if ((gVar != zVar && zVar.f4345b != gVar) || (fVar = (kd.f) zVar.f4344a.invoke(this)) == null) {
                return null;
            }
            return fVar;
        } else if (kd.d.f15029a != key) {
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
