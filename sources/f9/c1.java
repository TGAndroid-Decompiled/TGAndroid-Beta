package f9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class c1 extends AbstractList implements RandomAccess, Serializable {
    public final List f10267a;
    public final e9.k f10268b;

    public c1(List list, e9.k kVar) {
        list.getClass();
        this.f10267a = list;
        this.f10268b = kVar;
    }

    @Override
    public final Object get(int i10) {
        return this.f10268b.apply(this.f10267a.get(i10));
    }

    @Override
    public final boolean isEmpty() {
        return this.f10267a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new b1(this, this.f10267a.listIterator(i10), 0);
    }

    @Override
    public final Object remove(int i10) {
        return this.f10268b.apply(this.f10267a.remove(i10));
    }

    @Override
    public final void removeRange(int i10, int i11) {
        this.f10267a.subList(i10, i11).clear();
    }

    @Override
    public final int size() {
        return this.f10267a.size();
    }
}
