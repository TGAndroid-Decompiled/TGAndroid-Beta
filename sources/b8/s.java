package b8;

import java.util.AbstractMap;
public final class s extends l {
    public final t f3051c;

    public s(t tVar) {
        this.f3051c = tVar;
    }

    @Override
    public final Object get(int i3) {
        t tVar = this.f3051c;
        n1.a(i3, tVar.f3067e);
        Object[] objArr = tVar.d;
        int i10 = i3 + i3;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f3051c.f3067e;
    }
}
