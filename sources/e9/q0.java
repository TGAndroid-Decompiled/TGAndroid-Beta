package e9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class q0 extends n1 implements ListIterator {
    public final int f9022b;
    public final AbstractList f9023c;

    public q0(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f9022b = i10;
        this.f9023c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f9022b) {
            case 0:
                return ((r0) this.f9023c).f9026b.apply(obj);
            default:
                return ((s0) this.f9023c).f9030b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f9011a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f9011a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f9011a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f9011a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
