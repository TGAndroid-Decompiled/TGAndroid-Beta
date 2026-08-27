package g7;

import java.util.AbstractMap;

public final class n9 extends k9 {

    public final a f6569c;

    public n9(a aVar) {
        this.f6569c = aVar;
    }

    @Override
    public final Object get(int i10) {
        a aVar = this.f6569c;
        c7.a(i10, aVar.f6400e);
        int i11 = i10 + i10;
        Object[] objArr = aVar.d;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f6569c.f6400e;
    }
}
