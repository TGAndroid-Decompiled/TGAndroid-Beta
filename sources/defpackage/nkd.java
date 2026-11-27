package defpackage;

import java.util.Iterator;
public final class nkd extends thd {
    public final transient xkd h;
    public final transient rkd n;

    public nkd(xkd xkdVar, rkd rkdVar) {
        super((byte) 1);
        this.h = xkdVar;
        this.n = rkdVar;
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
