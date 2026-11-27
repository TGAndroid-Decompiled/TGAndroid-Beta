package defpackage;

import java.util.Iterator;
public final class ymd extends okd {
    public final transient hnd c;
    public final transient bnd d;

    public ymd(hnd hndVar, bnd bndVar) {
        this.c = hndVar;
        this.d = bndVar;
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
    public final vjd k() {
        return this.d;
    }

    @Override
    public final int size() {
        return this.c.h;
    }
}
