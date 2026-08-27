package e7;

import g7.s6;
import j$.util.Objects;
import java.util.AbstractMap;

public final class h extends d {

    public final i f5326c;

    public h(i iVar) {
        this.f5326c = iVar;
    }

    @Override
    public final Object get(int i10) {
        i iVar = this.f5326c;
        s6.a(i10, iVar.f5328e);
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
        return this.f5326c.f5328e;
    }
}
