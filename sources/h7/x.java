package h7;

import java.util.AbstractMap;
public final class x extends s {
    public final y f10169c;

    public x(y yVar) {
        this.f10169c = yVar;
    }

    @Override
    public final Object get(int i9) {
        y yVar = this.f10169c;
        f7.b8.a(i9, yVar.f10181e);
        int i10 = i9 + i9;
        Object[] objArr = yVar.d;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f10169c.f10181e;
    }
}
