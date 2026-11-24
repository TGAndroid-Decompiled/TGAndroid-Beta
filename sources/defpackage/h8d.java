package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
public final class h8d extends r6d {
    public final l8d r;

    public h8d(l8d l8dVar) {
        super((byte) 2);
        this.r = l8dVar;
    }

    @Override
    public final Object get(int i) {
        l8d l8dVar = this.r;
        k4f.a(i, l8dVar.w);
        Object[] objArr = l8dVar.s;
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
