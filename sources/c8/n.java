package c8;

import java.util.AbstractMap;
public final class n extends i {
    public final o f4881c;

    public n(o oVar) {
        this.f4881c = oVar;
    }

    @Override
    public final Object get(int i7) {
        o oVar = this.f4881c;
        a8.g8.a(i7, oVar.f4892e);
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
        return this.f4881c.f4892e;
    }
}
