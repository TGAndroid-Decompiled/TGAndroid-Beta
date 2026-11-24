package defpackage;

import java.util.Iterator;
public final class hgd extends xcd {
    public final transient ngd h;
    public final transient kgd n;

    public hgd(ngd ngdVar, kgd kgdVar) {
        super((byte) 0);
        this.h = ngdVar;
        this.n = kgdVar;
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
