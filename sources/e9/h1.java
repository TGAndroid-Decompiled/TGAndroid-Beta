package e9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class h1 extends AbstractList implements RandomAccess, Serializable {
    public final List f8452a;
    public final d9.k f8453b;

    public h1(List list, d9.k kVar) {
        list.getClass();
        this.f8452a = list;
        this.f8453b = kVar;
    }

    @Override
    public final Object get(int i10) {
        return this.f8453b.apply(this.f8452a.get(i10));
    }

    @Override
    public final boolean isEmpty() {
        return this.f8452a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new g1(this, this.f8452a.listIterator(i10), 0);
    }

    @Override
    public final Object remove(int i10) {
        return this.f8453b.apply(this.f8452a.remove(i10));
    }

    @Override
    public final void removeRange(int i10, int i11) {
        this.f8452a.subList(i10, i11).clear();
    }

    @Override
    public final int size() {
        return this.f8452a.size();
    }
}
