package c8;

import java.util.Iterator;
public final class p extends j {
    public final transient r f4904c;
    public final transient q d;

    public p(r rVar, q qVar) {
        this.f4904c = rVar;
        this.d = qVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f4904c.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(Object[] objArr) {
        return this.d.f(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final int size() {
        this.f4904c.getClass();
        return 1;
    }
}
