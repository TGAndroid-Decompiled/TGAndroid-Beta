package h7;

import java.util.AbstractMap;
public final class m9 extends j9 {
    public final a f7709c;

    public m9(a aVar) {
        this.f7709c = aVar;
    }

    @Override
    public final Object get(int i10) {
        a aVar = this.f7709c;
        t7.a(i10, aVar.f7546e);
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
        return this.f7709c.f7546e;
    }
}
