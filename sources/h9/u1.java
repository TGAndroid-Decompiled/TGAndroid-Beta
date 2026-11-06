package h9;

import a8.ia;
import j$.util.Objects;
import java.util.AbstractMap;
public final class u1 extends i0 {
    public final v1 f14400c;

    public u1(v1 v1Var) {
        this.f14400c = v1Var;
    }

    @Override
    public final Object get(int i7) {
        v1 v1Var = this.f14400c;
        ia.j(i7, v1Var.h);
        Object[] objArr = v1Var.f14405e;
        int i10 = i7 * 2;
        int i11 = v1Var.f14406f;
        Object obj = objArr[i10 + i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + (i11 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final int size() {
        return this.f14400c.h;
    }
}
