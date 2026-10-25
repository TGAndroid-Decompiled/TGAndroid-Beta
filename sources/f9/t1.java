package f9;

import a8.yb;
import j$.util.Objects;
import java.util.AbstractMap;
public final class t1 extends i0 {
    public final u1 f10346c;

    public t1(u1 u1Var) {
        this.f10346c = u1Var;
    }

    @Override
    public final Object get(int i10) {
        u1 u1Var = this.f10346c;
        yb.j(i10, u1Var.h);
        Object[] objArr = u1Var.e;
        int i11 = i10 * 2;
        int i12 = u1Var.f10348f;
        Object obj = objArr[i11 + i12];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + (i12 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final int size() {
        return this.f10346c.h;
    }
}
