package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
public final class jad extends t8d {
    public final nad r;

    public jad(nad nadVar) {
        super((byte) 2);
        this.r = nadVar;
    }

    @Override
    public final Object get(int i) {
        nad nadVar = this.r;
        m6f.a(i, nadVar.w);
        Object[] objArr = nadVar.s;
        int i2 = i << 1;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.r.w;
    }
}
