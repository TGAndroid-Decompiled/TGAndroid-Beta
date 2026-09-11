package e9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class r0 extends AbstractList implements RandomAccess, Serializable {
    public final List f8997a;
    public final d9.e f8998b;

    public r0(List list, d9.e eVar) {
        list.getClass();
        this.f8997a = list;
        this.f8998b = eVar;
    }

    @Override
    public final Object get(int i10) {
        return this.f8998b.apply(this.f8997a.get(i10));
    }

    @Override
    public final boolean isEmpty() {
        return this.f8997a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new q0(this, this.f8997a.listIterator(i10), 0);
    }

    @Override
    public final Object remove(int i10) {
        return this.f8998b.apply(this.f8997a.remove(i10));
    }

    @Override
    public final void removeRange(int i10, int i11) {
        this.f8997a.subList(i10, i11).clear();
    }

    @Override
    public final int size() {
        return this.f8997a.size();
    }
}
