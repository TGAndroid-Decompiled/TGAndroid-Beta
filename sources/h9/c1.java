package h9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class c1 extends AbstractList implements RandomAccess, Serializable {
    public final List f13664a;
    public final g9.k f13665b;

    public c1(List list, g9.k kVar) {
        list.getClass();
        this.f13664a = list;
        this.f13665b = kVar;
    }

    @Override
    public final Object get(int i7) {
        return this.f13665b.apply(this.f13664a.get(i7));
    }

    @Override
    public final boolean isEmpty() {
        return this.f13664a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i7) {
        return new b1(this, this.f13664a.listIterator(i7), 0);
    }

    @Override
    public final Object remove(int i7) {
        return this.f13665b.apply(this.f13664a.remove(i7));
    }

    @Override
    public final void removeRange(int i7, int i10) {
        this.f13664a.subList(i7, i10).clear();
    }

    @Override
    public final int size() {
        return this.f13664a.size();
    }
}
