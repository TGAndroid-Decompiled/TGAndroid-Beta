package defpackage;

import java.util.AbstractMap;
public final class r7e extends x5e {
    public final x7e r;

    public r7e(x7e x7eVar) {
        super((byte) 5);
        this.r = x7eVar;
    }

    @Override
    public final Object get(int i) {
        x7e x7eVar = this.r;
        r3f.a(i, x7eVar.x);
        Object[] objArr = x7eVar.w;
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
