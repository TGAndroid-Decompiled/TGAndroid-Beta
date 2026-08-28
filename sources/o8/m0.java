package o8;

import j$.util.Objects;
import java.util.AbstractMap;
public final class m0 extends z {
    public final n0 f19059c;

    public m0(n0 n0Var) {
        this.f19059c = n0Var;
    }

    @Override
    public final Object get(int i9) {
        n0 n0Var = this.f19059c;
        g7.d0.b(i9, n0Var.f19063f);
        Object[] objArr = n0Var.f19062e;
        int i10 = i9 * 2;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return this.f19059c.f19063f;
    }
}
