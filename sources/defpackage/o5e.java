package defpackage;

import java.util.AbstractMap;
public final class o5e extends u3e {
    public final u5e r;

    public o5e(u5e u5eVar) {
        super((byte) 5);
        this.r = u5eVar;
    }

    @Override
    public final Object get(int i) {
        u5e u5eVar = this.r;
        p1f.a(i, u5eVar.x);
        Object[] objArr = u5eVar.w;
        int i2 = i << 1;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.r.x;
    }
}
