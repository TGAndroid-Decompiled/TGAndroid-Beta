package defpackage;

import java.util.AbstractMap;
public final class oid extends ted {
    public final tid h;

    public oid(tid tidVar) {
        super((byte) 0);
        this.h = tidVar;
    }

    @Override
    public final Object get(int i) {
        tid tidVar = this.h;
        d7f.a(i, tidVar.r ? 1 : 0);
        Object[] objArr = tidVar.n;
        int i2 = i << 1;
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
