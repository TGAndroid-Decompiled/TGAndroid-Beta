package defpackage;

import java.util.AbstractMap;
public final class nhd extends ped {
    public final shd h;

    public nhd(shd shdVar) {
        super((byte) 1);
        this.h = shdVar;
    }

    @Override
    public final Object get(int i) {
        shd shdVar = this.h;
        k6f.a(i, shdVar.r ? 1 : 0);
        int i2 = i << 1;
        Object[] objArr = shdVar.n;
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
