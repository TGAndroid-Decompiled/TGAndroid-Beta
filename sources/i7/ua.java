package i7;

import java.util.AbstractMap;
public final class ua extends ra {
    public final va f8520c;

    public ua(va vaVar) {
        this.f8520c = vaVar;
    }

    @Override
    public final Object get(int i10) {
        va vaVar = this.f8520c;
        h7.h8.a(i10, vaVar.f8528e);
        Object[] objArr = vaVar.d;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f8520c.f8528e;
    }
}
