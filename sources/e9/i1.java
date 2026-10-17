package e9;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
public final class i1 extends AbstractSequentialList implements Serializable {
    public final List f8459a;
    public final d9.k f8460b;

    public i1(List list, d9.k kVar) {
        list.getClass();
        this.f8459a = list;
        this.f8460b = kVar;
    }

    @Override
    public final boolean isEmpty() {
        return this.f8459a.isEmpty();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new g1(this, this.f8459a.listIterator(i10), 1);
    }

    @Override
    public final void removeRange(int i10, int i11) {
        this.f8459a.subList(i10, i11).clear();
    }

    @Override
    public final int size() {
        return this.f8459a.size();
    }
}
