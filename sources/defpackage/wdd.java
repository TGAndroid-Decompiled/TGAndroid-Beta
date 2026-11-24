package defpackage;

import java.util.AbstractMap;
public final class wdd extends aad {
    public final ced h;

    public wdd(ced cedVar) {
        super((byte) 0);
        this.h = cedVar;
    }

    @Override
    public final Object get(int i) {
        ced cedVar = this.h;
        l2f.a(i, cedVar.r ? 1 : 0);
        Object[] objArr = cedVar.n;
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
