package defpackage;

import java.util.Iterator;
public final class o6e extends q4e {
    public final transient a7e s;
    public final transient u6e w;

    public o6e(a7e a7eVar, u6e u6eVar) {
        super((byte) 5);
        this.s = a7eVar;
        this.w = u6eVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.s.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return this.w.listIterator(0);
    }

    @Override
    public final int p(Object[] objArr) {
        return this.w.p(objArr);
    }

    @Override
    public final int size() {
        return this.s.h;
    }
}
