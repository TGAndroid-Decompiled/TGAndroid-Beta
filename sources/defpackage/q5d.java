package defpackage;

import java.util.Iterator;
public final class q5d extends jhf {
    public final transient c6d h;
    public final transient s5d n;

    public q5d(c6d c6dVar, s5d s5dVar) {
        super((byte) 3);
        this.h = c6dVar;
        this.n = s5dVar;
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
