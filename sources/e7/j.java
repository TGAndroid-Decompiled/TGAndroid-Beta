package e7;

import java.util.Iterator;

public final class j extends f {

    public final transient l f5329c;
    public final transient k d;

    public j(l lVar, k kVar) {
        this.f5329c = lVar;
        this.d = kVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f5329c.get(obj) != null;
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
        return this.f5329c.h;
    }
}
