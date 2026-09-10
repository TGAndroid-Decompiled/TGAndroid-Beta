package e9;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
public final class s0 extends AbstractSequentialList implements Serializable {
    public final List f7425a;
    public final d9.e f7426b;

    public s0(List list, d9.e eVar) {
        list.getClass();
        this.f7425a = list;
        this.f7426b = eVar;
    }

    @Override
    public final boolean isEmpty() {
        return this.f7425a.isEmpty();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new q0(this, this.f7425a.listIterator(i10), 1);
    }

    @Override
    public final void removeRange(int i10, int i11) {
        this.f7425a.subList(i10, i11).clear();
    }

    @Override
    public final int size() {
        return this.f7425a.size();
    }
}
