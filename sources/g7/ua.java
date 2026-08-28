package g7;

import java.util.AbstractMap;
public final class ua extends ra {
    public final va f7382c;

    public ua(va vaVar) {
        this.f7382c = vaVar;
    }

    @Override
    public final Object get(int i9) {
        va vaVar = this.f7382c;
        f7.p7.a(i9, vaVar.f7391e);
        Object[] objArr = vaVar.d;
        int i10 = i9 + i9;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f7382c.f7391e;
    }
}
