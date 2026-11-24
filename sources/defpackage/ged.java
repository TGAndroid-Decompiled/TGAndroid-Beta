package defpackage;

import java.util.Iterator;
public final class ged extends vad {
    public final transient med h;
    public final transient jed n;

    public ged(med medVar, jed jedVar) {
        super((byte) 0);
        this.h = medVar;
        this.n = jedVar;
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
