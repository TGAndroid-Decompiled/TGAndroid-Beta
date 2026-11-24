package defpackage;

import java.util.Iterator;
public final class jkd extends yhd {
    public final transient skd c;
    public final transient mkd d;

    public jkd(skd skdVar, mkd mkdVar) {
        this.c = skdVar;
        this.d = mkdVar;
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
    public final fhd k() {
        return this.d;
    }

    @Override
    public final int size() {
        return this.c.h;
    }
}
