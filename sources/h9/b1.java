package h9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class b1 extends g2 implements ListIterator {
    public final int f13977b;
    public final AbstractList f13978c;

    public b1(AbstractList abstractList, ListIterator listIterator, int i7) {
        super(listIterator);
        this.f13977b = i7;
        this.f13978c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f13977b) {
            case 0:
                return ((c1) this.f13978c).f13983b.apply(obj);
            default:
                return ((d1) this.f13978c).f13990b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f14002a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f14002a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f14002a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f14002a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
