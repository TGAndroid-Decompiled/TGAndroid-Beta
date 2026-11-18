package h9;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
public final class d1 extends AbstractSequentialList implements Serializable {
    public final List f13989a;
    public final g9.k f13990b;

    public d1(List list, g9.k kVar) {
        list.getClass();
        this.f13989a = list;
        this.f13990b = kVar;
    }

    @Override
    public final boolean isEmpty() {
        return this.f13989a.isEmpty();
    }

    @Override
    public final ListIterator listIterator(int i7) {
        return new b1(this, this.f13989a.listIterator(i7), 1);
    }

    @Override
    public final void removeRange(int i7, int i10) {
        this.f13989a.subList(i7, i10).clear();
    }

    @Override
    public final int size() {
        return this.f13989a.size();
    }
}
