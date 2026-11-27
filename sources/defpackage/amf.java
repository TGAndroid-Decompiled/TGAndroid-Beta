package defpackage;

import java.util.Iterator;
public final class amf extends jhf {
    public final transient qmf h;
    public final transient jmf n;

    public amf(qmf qmfVar, jmf jmfVar) {
        super((byte) 2);
        this.h = qmfVar;
        this.n = jmfVar;
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
