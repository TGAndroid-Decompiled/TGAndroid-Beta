package e9;

import j$.util.Objects;
import java.util.AbstractMap;
import v7.u6;
public final class y1 extends n0 {
    public final z1 f8541c;

    public y1(z1 z1Var) {
        this.f8541c = z1Var;
    }

    @Override
    public final Object get(int i10) {
        z1 z1Var = this.f8541c;
        u6.j(i10, z1Var.h);
        Object[] objArr = z1Var.e;
        int i11 = i10 * 2;
        int i12 = z1Var.f8543f;
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
        return this.f8541c.h;
    }
}
