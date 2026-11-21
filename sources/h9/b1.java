package h9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class b1 extends g2 implements ListIterator {
    public final int f14003b;
    public final AbstractList f14004c;

    public b1(AbstractList abstractList, ListIterator listIterator, int i7) {
        super(listIterator);
        this.f14003b = i7;
        this.f14004c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f14003b) {
            case 0:
                return ((c1) this.f14004c).f14009b.apply(obj);
            default:
                return ((d1) this.f14004c).f14016b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f14028a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f14028a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f14028a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f14028a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
