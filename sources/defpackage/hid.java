package defpackage;

import java.util.Iterator;
public final class hid extends xfd {
    public final transient qid c;
    public final transient kid d;

    public hid(qid qidVar, kid kidVar) {
        this.c = qidVar;
        this.d = kidVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.c.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        return this.d.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final efd k() {
        return this.d;
    }

    @Override
    public final int size() {
        return this.c.h;
    }
}
