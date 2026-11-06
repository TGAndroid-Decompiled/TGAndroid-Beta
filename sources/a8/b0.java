package a8;

import java.util.AbstractMap;
public final class b0 extends u {
    public final c0 f327c;

    public b0(c0 c0Var) {
        this.f327c = c0Var;
    }

    @Override
    public final Object get(int i7) {
        c0 c0Var = this.f327c;
        x0.a(i7, c0Var.f346e);
        int i10 = i7 + i7;
        Object[] objArr = c0Var.d;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f327c.f346e;
    }
}
