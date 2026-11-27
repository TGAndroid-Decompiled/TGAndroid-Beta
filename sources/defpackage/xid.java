package defpackage;

import java.util.Iterator;
public final class xid extends ofd {
    public final transient djd h;
    public final transient ajd n;

    public xid(djd djdVar, ajd ajdVar) {
        super((byte) 0);
        this.h = djdVar;
        this.n = ajdVar;
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
