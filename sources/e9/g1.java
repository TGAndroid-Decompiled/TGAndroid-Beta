package e9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class g1 extends l2 implements ListIterator {
    public final int f8450b;
    public final AbstractList f8451c;

    public g1(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f8450b = i10;
        this.f8451c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f8450b) {
            case 0:
                return ((h1) this.f8451c).f8455b.apply(obj);
            default:
                return ((i1) this.f8451c).f8460b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f8468a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f8468a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f8468a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f8468a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
