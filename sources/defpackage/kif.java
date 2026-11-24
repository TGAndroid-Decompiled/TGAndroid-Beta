package defpackage;

import java.util.AbstractMap;
public final class kif extends h9f {
    public final wif h;

    public kif(wif wifVar) {
        super((byte) 2);
        this.h = wifVar;
    }

    @Override
    public final Object get(int i) {
        wif wifVar = this.h;
        s3f.a(i, wifVar.r ? 1 : 0);
        Object[] objArr = wifVar.n;
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
