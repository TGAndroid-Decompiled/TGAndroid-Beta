package defpackage;

import java.util.Iterator;
public final class s7d extends kjf {
    public final transient e8d h;
    public final transient u7d n;

    public s7d(e8d e8dVar, u7d u7dVar) {
        super((byte) 3);
        this.h = e8dVar;
        this.n = u7dVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.h.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        return this.n.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.n.listIterator(0);
    }

    @Override
    public final int size() {
        this.h.getClass();
        return 1;
    }
}
