package g9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class c1 extends AbstractList implements RandomAccess, Serializable {
    public final List f12061a;
    public final f9.k f12062b;

    public c1(List list, f9.k kVar) {
        list.getClass();
        this.f12061a = list;
        this.f12062b = kVar;
    }

    @Override
    public final Object get(int i3) {
        return this.f12062b.apply(this.f12061a.get(i3));
    }

    @Override
    public final boolean isEmpty() {
        return this.f12061a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i3) {
        return new b1(this, this.f12061a.listIterator(i3), 0);
    }

    @Override
    public final Object remove(int i3) {
        return this.f12062b.apply(this.f12061a.remove(i3));
    }

    @Override
    public final void removeRange(int i3, int i10) {
        this.f12061a.subList(i3, i10).clear();
    }

    @Override
    public final int size() {
        return this.f12061a.size();
    }
}
