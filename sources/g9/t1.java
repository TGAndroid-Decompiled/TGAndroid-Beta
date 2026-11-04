package g9;

import b8.zb;
import j$.util.Objects;
import java.util.AbstractMap;
public final class t1 extends i0 {
    public final u1 f12151c;

    public t1(u1 u1Var) {
        this.f12151c = u1Var;
    }

    @Override
    public final Object get(int i3) {
        u1 u1Var = this.f12151c;
        zb.j(i3, u1Var.h);
        Object[] objArr = u1Var.f12153e;
        int i10 = i3 * 2;
        int i11 = u1Var.f12154f;
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
        return this.f12151c.h;
    }
}
