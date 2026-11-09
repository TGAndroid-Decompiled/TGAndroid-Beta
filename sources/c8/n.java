package c8;

import java.util.AbstractMap;
public final class n extends i {
    public final o f5768c;

    public n(o oVar) {
        this.f5768c = oVar;
    }

    @Override
    public final Object get(int i7) {
        o oVar = this.f5768c;
        a8.f8.a(i7, oVar.f5778e);
        Object[] objArr = oVar.d;
        int i10 = i7 + i7;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f5768c.f5778e;
    }
}
