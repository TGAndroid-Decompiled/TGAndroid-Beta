package e9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class r0 extends AbstractList implements RandomAccess, Serializable {
    public final List f8104a;
    public final d9.e f8105b;

    public r0(List list, d9.e eVar) {
        list.getClass();
        this.f8104a = list;
        this.f8105b = eVar;
    }

    @Override
    public final Object get(int i10) {
        return this.f8105b.apply(this.f8104a.get(i10));
    }

    @Override
    public final boolean isEmpty() {
        return this.f8104a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new q0(this, this.f8104a.listIterator(i10), 0);
    }

    @Override
    public final Object remove(int i10) {
        return this.f8105b.apply(this.f8104a.remove(i10));
    }

    @Override
    public final void removeRange(int i10, int i11) {
        this.f8104a.subList(i10, i11).clear();
    }

    @Override
    public final int size() {
        return this.f8104a.size();
    }
}
