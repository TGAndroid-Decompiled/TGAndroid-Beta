package h9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class c1 extends AbstractList implements RandomAccess, Serializable {
    public final List f14008a;
    public final g9.k f14009b;

    public c1(List list, g9.k kVar) {
        list.getClass();
        this.f14008a = list;
        this.f14009b = kVar;
    }

    @Override
    public final Object get(int i7) {
        return this.f14009b.apply(this.f14008a.get(i7));
    }

    @Override
    public final boolean isEmpty() {
        return this.f14008a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i7) {
        return new b1(this, this.f14008a.listIterator(i7), 0);
    }

    @Override
    public final Object remove(int i7) {
        return this.f14009b.apply(this.f14008a.remove(i7));
    }

    @Override
    public final void removeRange(int i7, int i10) {
        this.f14008a.subList(i7, i10).clear();
    }

    @Override
    public final int size() {
        return this.f14008a.size();
    }
}
