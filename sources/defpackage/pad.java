package defpackage;

import java.util.Iterator;
public final class pad extends t9d {
    public final transient xad r;
    public final transient uad s;

    public pad(xad xadVar, uad uadVar) {
        super((byte) 2);
        this.r = xadVar;
        this.s = uadVar;
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
