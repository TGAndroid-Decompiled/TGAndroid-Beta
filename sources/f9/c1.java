package f9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class c1 extends AbstractList implements RandomAccess, Serializable {
    public final List f10266a;
    public final e9.k f10267b;

    public c1(List list, e9.k kVar) {
        list.getClass();
        this.f10266a = list;
        this.f10267b = kVar;
    }

    @Override
    public final Object get(int i10) {
        return this.f10267b.apply(this.f10266a.get(i10));
    }

    @Override
    public final boolean isEmpty() {
        return this.f10266a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new b1(this, this.f10266a.listIterator(i10), 0);
    }

    @Override
    public final Object remove(int i10) {
        return this.f10267b.apply(this.f10266a.remove(i10));
    }

    @Override
    public final void removeRange(int i10, int i11) {
        this.f10266a.subList(i10, i11).clear();
    }

    @Override
    public final int size() {
        return this.f10266a.size();
    }
}
