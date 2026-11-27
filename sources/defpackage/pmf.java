package defpackage;

import java.util.AbstractMap;
public final class pmf extends zjf {
    public final v9d h;

    public pmf(v9d v9dVar) {
        super((byte) 3);
        this.h = v9dVar;
    }

    @Override
    public final Object get(int i) {
        v9d v9dVar = this.h;
        j7f.a(i, v9dVar.r ? 1 : 0);
        int i2 = i << 1;
        Object[] objArr = v9dVar.n;
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
