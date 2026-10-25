package f9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class b1 extends f2 implements ListIterator {
    public final int f10261b;
    public final AbstractList f10262c;

    public b1(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f10261b = i10;
        this.f10262c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f10261b) {
            case 0:
                return ((c1) this.f10262c).f10268b.apply(obj);
            default:
                return ((d1) this.f10262c).f10275b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f10281a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f10281a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f10281a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f10281a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
