package defpackage;

import java.util.AbstractMap;
public final class dkd extends ghd {
    public final ikd h;

    public dkd(ikd ikdVar) {
        super((byte) 1);
        this.h = ikdVar;
    }

    @Override
    public final Object get(int i) {
        ikd ikdVar = this.h;
        b9f.a(i, ikdVar.r ? 1 : 0);
        int i2 = i << 1;
        Object[] objArr = ikdVar.n;
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
