package h7;

import java.util.AbstractMap;

public final class ua extends ra {

    public final va f8556c;

    public ua(va vaVar) {
        this.f8556c = vaVar;
    }

    @Override
    public final Object get(int i10) {
        va vaVar = this.f8556c;
        g7.r7.a(i10, vaVar.f8564e);
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
        return this.f8556c.f8564e;
    }
}
