package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
public final class lmd extends vjd {
    public final smd c;

    public lmd(smd smdVar) {
        this.c = smdVar;
    }

    @Override
    public final Object get(int i) {
        smd smdVar = this.c;
        k4f.a(i, smdVar.e);
        Object[] objArr = smdVar.d;
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
