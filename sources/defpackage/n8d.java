package defpackage;

import java.util.Iterator;
public final class n8d extends r7d {
    public final transient v8d r;
    public final transient s8d s;

    public n8d(v8d v8dVar, s8d s8dVar) {
        super((byte) 2);
        this.r = v8dVar;
        this.s = s8dVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.r.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return this.s.listIterator(0);
    }

    @Override
    public final int p(Object[] objArr) {
        return this.s.p(objArr);
    }

    @Override
    public final int size() {
        return this.r.h;
    }
}
