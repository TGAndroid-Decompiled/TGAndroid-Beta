package j7;

import java.util.AbstractMap;
public final class o9 extends l9 {
    public final a f9722c;

    public o9(a aVar) {
        this.f9722c = aVar;
    }

    @Override
    public final Object get(int i10) {
        a aVar = this.f9722c;
        k8.a(i10, aVar.f9548e);
        int i11 = i10 + i10;
        Object[] objArr = aVar.d;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f9722c.f9548e;
    }
}
