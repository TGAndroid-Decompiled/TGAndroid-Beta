package e9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class r0 extends AbstractList implements RandomAccess, Serializable {
    public final List f7421a;
    public final d9.e f7422b;

    public r0(List list, d9.e eVar) {
        list.getClass();
        this.f7421a = list;
        this.f7422b = eVar;
    }

    @Override
    public final Object get(int i10) {
        return this.f7422b.apply(this.f7421a.get(i10));
    }

    @Override
    public final boolean isEmpty() {
        return this.f7421a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new q0(this, this.f7421a.listIterator(i10), 0);
    }

    @Override
    public final Object remove(int i10) {
        return this.f7422b.apply(this.f7421a.remove(i10));
    }

    @Override
    public final void removeRange(int i10, int i11) {
        this.f7421a.subList(i10, i11).clear();
    }

    @Override
    public final int size() {
        return this.f7421a.size();
    }
}
