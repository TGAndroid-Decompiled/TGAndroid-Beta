package e9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class h1 extends AbstractList implements RandomAccess, Serializable {
    public final List f6368a;
    public final d9.k f6369b;

    public h1(List list, d9.k kVar) {
        list.getClass();
        this.f6368a = list;
        this.f6369b = kVar;
    }

    @Override
    public final Object get(int i10) {
        return this.f6369b.apply(this.f6368a.get(i10));
    }

    @Override
    public final boolean isEmpty() {
        return this.f6368a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new g1(this, this.f6368a.listIterator(i10), 0);
    }

    @Override
    public final Object remove(int i10) {
        return this.f6369b.apply(this.f6368a.remove(i10));
    }

    @Override
    public final void removeRange(int i10, int i11) {
        this.f6368a.subList(i10, i11).clear();
    }

    @Override
    public final int size() {
        return this.f6368a.size();
    }
}
