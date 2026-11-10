package h9;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
public final class d1 extends AbstractSequentialList implements Serializable {
    public final List f14314a;
    public final g9.k f14315b;

    public d1(List list, g9.k kVar) {
        list.getClass();
        this.f14314a = list;
        this.f14315b = kVar;
    }

    @Override
    public final boolean isEmpty() {
        return this.f14314a.isEmpty();
    }

    @Override
    public final ListIterator listIterator(int i7) {
        return new b1(this, this.f14314a.listIterator(i7), 1);
    }

    @Override
    public final void removeRange(int i7, int i10) {
        this.f14314a.subList(i7, i10).clear();
    }

    @Override
    public final int size() {
        return this.f14314a.size();
    }
}
