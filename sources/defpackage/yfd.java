package defpackage;

import java.util.AbstractMap;
public final class yfd extends ccd {
    public final dgd h;

    public yfd(dgd dgdVar) {
        super((byte) 0);
        this.h = dgdVar;
    }

    @Override
    public final Object get(int i) {
        dgd dgdVar = this.h;
        n4f.a(i, dgdVar.r ? 1 : 0);
        Object[] objArr = dgdVar.n;
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
