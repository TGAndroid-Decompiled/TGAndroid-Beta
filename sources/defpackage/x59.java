package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
public final class x59 extends mm5 {
    public final y59 c;

    public x59(y59 y59Var) {
        this.c = y59Var;
    }

    @Override
    public final Object get(int i) {
        y59 y59Var = this.c;
        gre.j(i, y59Var.h);
        Object[] objArr = y59Var.e;
        int i2 = i << 1;
        boolean z = y59Var.f;
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
