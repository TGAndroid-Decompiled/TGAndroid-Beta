package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
public final class k99 extends po5 {
    public final l99 c;

    public k99(l99 l99Var) {
        this.c = l99Var;
    }

    @Override
    public final Object get(int i) {
        l99 l99Var = this.c;
        yve.j(i, l99Var.h);
        Object[] objArr = l99Var.e;
        int i2 = i << 1;
        boolean z = l99Var.f;
        Object obj = objArr[i2 + (z ? 1 : 0)];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (!z ? 1 : 0)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final int size() {
        return this.c.h;
    }
}
