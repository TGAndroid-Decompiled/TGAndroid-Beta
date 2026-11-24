package defpackage;

import java.util.AbstractMap;
public final class zhf extends jff {
    public final c5d h;

    public zhf(c5d c5dVar) {
        super((byte) 3);
        this.h = c5dVar;
    }

    @Override
    public final Object get(int i) {
        c5d c5dVar = this.h;
        r2f.a(i, c5dVar.r ? 1 : 0);
        int i2 = i << 1;
        Object[] objArr = c5dVar.n;
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
