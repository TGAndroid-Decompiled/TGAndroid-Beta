package defpackage;

import java.util.Iterator;
public final class ljf extends uef {
    public final transient bkf h;
    public final transient ujf n;

    public ljf(bkf bkfVar, ujf ujfVar) {
        super((byte) 2);
        this.h = bkfVar;
        this.n = ujfVar;
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
