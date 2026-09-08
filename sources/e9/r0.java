package e9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class r0 extends AbstractList implements RandomAccess, Serializable {
    public final List f9025a;
    public final d9.e f9026b;

    public r0(List list, d9.e eVar) {
        list.getClass();
        this.f9025a = list;
        this.f9026b = eVar;
    }

    @Override
    public final Object get(int i10) {
        return this.f9026b.apply(this.f9025a.get(i10));
    }

    @Override
    public final boolean isEmpty() {
        return this.f9025a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new q0(this, this.f9025a.listIterator(i10), 0);
    }

    @Override
    public final Object remove(int i10) {
        return this.f9026b.apply(this.f9025a.remove(i10));
    }

    @Override
    public final void removeRange(int i10, int i11) {
        this.f9025a.subList(i10, i11).clear();
    }

    @Override
    public final int size() {
        return this.f9025a.size();
    }
}
