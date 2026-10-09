package e9;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
public final class s0 extends AbstractSequentialList implements Serializable {
    public final List f8796a;
    public final d9.e f8797b;

    public s0(List list, d9.e eVar) {
        list.getClass();
        this.f8796a = list;
        this.f8797b = eVar;
    }

    @Override
    public final boolean isEmpty() {
        return this.f8796a.isEmpty();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new q0(this, this.f8796a.listIterator(i10), 1);
    }

    @Override
    public final void removeRange(int i10, int i11) {
        this.f8796a.subList(i10, i11).clear();
    }

    @Override
    public final int size() {
        return this.f8796a.size();
    }
}
