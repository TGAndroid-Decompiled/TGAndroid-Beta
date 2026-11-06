package h9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class b1 extends g2 implements ListIterator {
    public final int f14300b;
    public final AbstractList f14301c;

    public b1(AbstractList abstractList, ListIterator listIterator, int i7) {
        super(listIterator);
        this.f14300b = i7;
        this.f14301c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f14300b) {
            case 0:
                return ((c1) this.f14301c).f14306b.apply(obj);
            default:
                return ((d1) this.f14301c).f14313b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f14325a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f14325a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f14325a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f14325a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
