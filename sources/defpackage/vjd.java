package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
public final class vjd extends fhd {
    public final ckd c;

    public vjd(ckd ckdVar) {
        this.c = ckdVar;
    }

    @Override
    public final Object get(int i) {
        ckd ckdVar = this.c;
        u1f.a(i, ckdVar.e);
        Object[] objArr = ckdVar.d;
        int i2 = i << 1;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final int size() {
        return this.c.e;
    }
}
