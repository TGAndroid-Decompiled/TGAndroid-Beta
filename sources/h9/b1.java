package h9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class b1 extends g2 implements ListIterator {
    public final int f14302b;
    public final AbstractList f14303c;

    public b1(AbstractList abstractList, ListIterator listIterator, int i7) {
        super(listIterator);
        this.f14302b = i7;
        this.f14303c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f14302b) {
            case 0:
                return ((c1) this.f14303c).f14308b.apply(obj);
            default:
                return ((d1) this.f14303c).f14315b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f14327a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f14327a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f14327a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f14327a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
