package n7;

import java.util.Iterator;
public final class p extends j {
    public final transient r f15679c;
    public final transient q d;

    public p(r rVar, q qVar) {
        this.f15679c = rVar;
        this.d = qVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f15679c.get(obj) != null) {
            return true;
        }
        return false;
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
        this.f15679c.getClass();
        return 1;
    }
}
