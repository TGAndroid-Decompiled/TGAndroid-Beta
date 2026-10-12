package e9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class h1 extends AbstractList implements RandomAccess, Serializable {
    public final List f8570a;
    public final d9.k f8571b;

    public h1(List list, d9.k kVar) {
        list.getClass();
        this.f8570a = list;
        this.f8571b = kVar;
    }

    @Override
    public final Object get(int i10) {
        return this.f8571b.apply(this.f8570a.get(i10));
    }

    @Override
    public final boolean isEmpty() {
        return this.f8570a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new g1(this, this.f8570a.listIterator(i10), 0);
    }

    @Override
    public final Object remove(int i10) {
        return this.f8571b.apply(this.f8570a.remove(i10));
    }

    @Override
    public final void removeRange(int i10, int i11) {
        this.f8570a.subList(i10, i11).clear();
    }

    @Override
    public final int size() {
        return this.f8570a.size();
    }
}
