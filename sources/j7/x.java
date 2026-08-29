package j7;

import java.util.AbstractMap;
public final class x extends s {
    public final y f11247c;

    public x(y yVar) {
        this.f11247c = yVar;
    }

    @Override
    public final Object get(int i10) {
        y yVar = this.f11247c;
        h7.u8.a(i10, yVar.f11261e);
        int i11 = i10 + i10;
        Object[] objArr = yVar.d;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f11247c.f11261e;
    }
}
