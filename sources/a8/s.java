package a8;

import java.util.AbstractMap;
public final class s extends l {
    public final t f906c;

    public s(t tVar) {
        this.f906c = tVar;
    }

    @Override
    public final Object get(int i10) {
        t tVar = this.f906c;
        o0.a(i10, tVar.e);
        Object[] objArr = tVar.d;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f906c.e;
    }
}
