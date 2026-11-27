package defpackage;

import java.util.AbstractMap;
public final class eae extends k8e {
    public final kae r;

    public eae(kae kaeVar) {
        super((byte) 5);
        this.r = kaeVar;
    }

    @Override
    public final Object get(int i) {
        kae kaeVar = this.r;
        h6f.a(i, kaeVar.x);
        Object[] objArr = kaeVar.w;
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
