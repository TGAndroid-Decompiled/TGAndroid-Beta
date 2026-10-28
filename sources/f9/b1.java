package f9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class b1 extends f2 implements ListIterator {
    public final int f10260b;
    public final AbstractList f10261c;

    public b1(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f10260b = i10;
        this.f10261c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f10260b) {
            case 0:
                return ((c1) this.f10261c).f10267b.apply(obj);
            default:
                return ((d1) this.f10261c).f10274b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f10280a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f10280a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f10280a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f10280a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
