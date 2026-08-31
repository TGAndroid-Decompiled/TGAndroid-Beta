package h7;

import java.util.Iterator;
public final class j extends f {
    public final transient l f7334c;
    public final transient k d;

    public j(l lVar, k kVar) {
        this.f7334c = lVar;
        this.d = kVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f7334c.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        return this.d.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f7334c.h;
    }
}
