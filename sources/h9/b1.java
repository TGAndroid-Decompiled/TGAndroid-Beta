package h9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class b1 extends f2 implements ListIterator {
    public final int f13658b;
    public final AbstractList f13659c;

    public b1(AbstractList abstractList, ListIterator listIterator, int i7) {
        super(listIterator);
        this.f13658b = i7;
        this.f13659c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f13658b) {
            case 0:
                return ((c1) this.f13659c).f13665b.apply(obj);
            default:
                return ((d1) this.f13659c).f13672b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f13679a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f13679a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f13679a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f13679a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
