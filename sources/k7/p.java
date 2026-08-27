package k7;

import java.util.Iterator;

public final class p extends j {

    public final transient r f14904c;
    public final transient q d;

    public p(r rVar, q qVar) {
        this.f14904c = rVar;
        this.d = qVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f14904c.get(obj) != null;
    }

    @Override
    public final int i(Object[] objArr) {
        return this.d.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final int size() {
        this.f14904c.getClass();
        return 1;
    }
}
