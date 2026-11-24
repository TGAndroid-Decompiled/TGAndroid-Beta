package defpackage;

import java.util.AbstractMap;
public final class akf extends khf {
    public final e7d h;

    public akf(e7d e7dVar) {
        super((byte) 3);
        this.h = e7dVar;
    }

    @Override
    public final Object get(int i) {
        e7d e7dVar = this.h;
        t4f.a(i, e7dVar.r ? 1 : 0);
        int i2 = i << 1;
        Object[] objArr = e7dVar.n;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.h.r ? 1 : 0;
    }
}
