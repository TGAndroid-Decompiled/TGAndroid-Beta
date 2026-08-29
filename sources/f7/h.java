package f7;

import h7.i7;
import j$.util.Objects;
import java.util.AbstractMap;
public final class h extends d {
    public final i f6663c;

    public h(i iVar) {
        this.f6663c = iVar;
    }

    @Override
    public final Object get(int i10) {
        i iVar = this.f6663c;
        i7.a(i10, iVar.f6665e);
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
        return this.f6663c.f6665e;
    }
}
