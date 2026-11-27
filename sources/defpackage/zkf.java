package defpackage;

import java.util.AbstractMap;
public final class zkf extends wbf {
    public final llf h;

    public zkf(llf llfVar) {
        super((byte) 2);
        this.h = llfVar;
    }

    @Override
    public final Object get(int i) {
        llf llfVar = this.h;
        i6f.a(i, llfVar.r ? 1 : 0);
        Object[] objArr = llfVar.n;
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
