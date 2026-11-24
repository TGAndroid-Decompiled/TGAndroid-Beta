package defpackage;

import java.util.AbstractMap;
public final class jgf extends f7f {
    public final vgf h;

    public jgf(vgf vgfVar) {
        super((byte) 2);
        this.h = vgfVar;
    }

    @Override
    public final Object get(int i) {
        vgf vgfVar = this.h;
        q1f.a(i, vgfVar.r ? 1 : 0);
        Object[] objArr = vgfVar.n;
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
