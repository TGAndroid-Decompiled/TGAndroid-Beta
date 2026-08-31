package k7;

import java.util.AbstractMap;
public final class ua extends ra {
    public final va f10739c;

    public ua(va vaVar) {
        this.f10739c = vaVar;
    }

    @Override
    public final Object get(int i10) {
        va vaVar = this.f10739c;
        j7.u8.a(i10, vaVar.f10747e);
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
        return this.f10739c.f10747e;
    }
}
