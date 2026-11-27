package defpackage;

import java.util.Iterator;
public final class ebe extends g9e {
    public final transient qbe s;
    public final transient kbe w;

    public ebe(qbe qbeVar, kbe kbeVar) {
        super((byte) 5);
        this.s = qbeVar;
        this.w = kbeVar;
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
