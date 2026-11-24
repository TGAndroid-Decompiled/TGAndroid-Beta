package defpackage;

import java.util.Iterator;
public final class wfd extends add {
    public final transient ggd h;
    public final transient agd n;

    public wfd(ggd ggdVar, agd agdVar) {
        super((byte) 1);
        this.h = ggdVar;
        this.n = agdVar;
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
