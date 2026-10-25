package f9;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
public final class d1 extends AbstractSequentialList implements Serializable {
    public final List f10274a;
    public final e9.k f10275b;

    public d1(List list, e9.k kVar) {
        list.getClass();
        this.f10274a = list;
        this.f10275b = kVar;
    }

    @Override
    public final boolean isEmpty() {
        return this.f10274a.isEmpty();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new b1(this, this.f10274a.listIterator(i10), 1);
    }

    @Override
    public final void removeRange(int i10, int i11) {
        this.f10274a.subList(i10, i11).clear();
    }

    @Override
    public final int size() {
        return this.f10274a.size();
    }
}
