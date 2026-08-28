package j7;

import java.util.AbstractMap;
public final class n extends i {
    public final o f14033c;

    public n(o oVar) {
        this.f14033c = oVar;
    }

    @Override
    public final Object get(int i9) {
        o oVar = this.f14033c;
        f7.y8.a(i9, oVar.f14042e);
        Object[] objArr = oVar.d;
        int i10 = i9 + i9;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f14033c.f14042e;
    }
}
