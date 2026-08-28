package f7;

import java.util.AbstractMap;
public final class o9 extends l9 {
    public final a f5775c;

    public o9(a aVar) {
        this.f5775c = aVar;
    }

    @Override
    public final Object get(int i9) {
        a aVar = this.f5775c;
        a7.a(i9, aVar.f5598e);
        int i10 = i9 + i9;
        Object[] objArr = aVar.d;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f5775c.f5598e;
    }
}
