package h9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class b1 extends g2 implements ListIterator {
    public final int f14006b;
    public final AbstractList f14007c;

    public b1(AbstractList abstractList, ListIterator listIterator, int i7) {
        super(listIterator);
        this.f14006b = i7;
        this.f14007c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f14006b) {
            case 0:
                return ((c1) this.f14007c).f14012b.apply(obj);
            default:
                return ((d1) this.f14007c).f14019b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f14031a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f14031a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f14031a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f14031a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
