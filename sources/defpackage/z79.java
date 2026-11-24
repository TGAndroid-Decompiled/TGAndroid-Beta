package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
public final class z79 extends mo5 {
    public final a89 c;

    public z79(a89 a89Var) {
        this.c = a89Var;
    }

    @Override
    public final Object get(int i) {
        a89 a89Var = this.c;
        jte.j(i, a89Var.h);
        Object[] objArr = a89Var.e;
        int i2 = i << 1;
        boolean z = a89Var.f;
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
