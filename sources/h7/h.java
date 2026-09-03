package h7;

import j$.util.Objects;
import j7.t7;
import java.util.AbstractMap;
public final class h extends d {
    public final i f7008c;

    public h(i iVar) {
        this.f7008c = iVar;
    }

    @Override
    public final Object get(int i10) {
        i iVar = this.f7008c;
        t7.a(i10, iVar.e);
        Object[] objArr = iVar.d;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f7008c.e;
    }
}
