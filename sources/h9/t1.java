package h9;

import a8.ma;
import j$.util.Objects;
import java.util.AbstractMap;
public final class t1 extends i0 {
    public final u1 f14063c;

    public t1(u1 u1Var) {
        this.f14063c = u1Var;
    }

    @Override
    public final Object get(int i7) {
        u1 u1Var = this.f14063c;
        ma.j(i7, u1Var.h);
        Object[] objArr = u1Var.f14065e;
        int i10 = i7 * 2;
        int i11 = u1Var.f14066f;
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
        return this.f14063c.h;
    }
}
