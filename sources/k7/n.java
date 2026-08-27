package k7;

import java.util.AbstractMap;

public final class n extends i {

    public final o f14887c;

    public n(o oVar) {
        this.f14887c = oVar;
    }

    @Override
    public final Object get(int i10) {
        o oVar = this.f14887c;
        g7.f9.b(i10, oVar.f14896e);
        Object[] objArr = oVar.d;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f14887c.f14896e;
    }
}
