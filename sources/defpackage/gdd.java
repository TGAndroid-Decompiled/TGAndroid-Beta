package defpackage;

import java.util.Iterator;
public final class gdd extends kcd {
    public final transient odd r;
    public final transient ldd s;

    public gdd(odd oddVar, ldd lddVar) {
        super((byte) 2);
        this.r = oddVar;
        this.s = lddVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.r.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return this.s.listIterator(0);
    }

    @Override
    public final int p(Object[] objArr) {
        return this.s.p(objArr);
    }

    @Override
    public final int size() {
        return this.r.h;
    }
}
