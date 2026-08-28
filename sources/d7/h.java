package d7;

import f7.r6;
import j$.util.Objects;
import java.util.AbstractMap;
public final class h extends d {
    public final i f4431c;

    public h(i iVar) {
        this.f4431c = iVar;
    }

    @Override
    public final Object get(int i9) {
        i iVar = this.f4431c;
        r6.a(i9, iVar.f4433e);
        Object[] objArr = iVar.d;
        int i10 = i9 + i9;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f4431c.f4433e;
    }
}
