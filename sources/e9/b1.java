package e9;

import j$.util.Objects;
import java.util.AbstractMap;
import v7.t6;
public final class b1 extends i0 {
    public final c1 f7358c;

    public b1(c1 c1Var) {
        this.f7358c = c1Var;
    }

    @Override
    public final Object get(int i10) {
        c1 c1Var = this.f7358c;
        t6.c(i10, c1Var.h);
        Object[] objArr = c1Var.e;
        int i11 = i10 * 2;
        int i12 = c1Var.f7362f;
        Object obj = objArr[i11 + i12];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + (i12 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return this.f7358c.h;
    }
}
