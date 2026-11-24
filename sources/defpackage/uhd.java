package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
public final class uhd extends efd {
    public final bid c;

    public uhd(bid bidVar) {
        this.c = bidVar;
    }

    @Override
    public final Object get(int i) {
        bid bidVar = this.c;
        sze.a(i, bidVar.e);
        Object[] objArr = bidVar.d;
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
