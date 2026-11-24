package defpackage;

import java.util.AbstractMap;
public final class mfd extends ncd {
    public final rfd h;

    public mfd(rfd rfdVar) {
        super((byte) 1);
        this.h = rfdVar;
    }

    @Override
    public final Object get(int i) {
        rfd rfdVar = this.h;
        i4f.a(i, rfdVar.r ? 1 : 0);
        int i2 = i << 1;
        Object[] objArr = rfdVar.n;
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
