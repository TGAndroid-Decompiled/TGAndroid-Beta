package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
public final class add extends kbd {
    public final edd r;

    public add(edd eddVar) {
        super((byte) 2);
        this.r = eddVar;
    }

    @Override
    public final Object get(int i) {
        edd eddVar = this.r;
        d9f.a(i, eddVar.w);
        Object[] objArr = eddVar.s;
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
