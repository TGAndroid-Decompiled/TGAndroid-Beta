package e9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class q0 extends n1 implements ListIterator {
    public final int f8794b;
    public final AbstractList f8795c;

    public q0(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f8794b = i10;
        this.f8795c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f8794b) {
            case 0:
                return ((r0) this.f8795c).f8798b.apply(obj);
            default:
                return ((s0) this.f8795c).f8802b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f8783a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f8783a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f8783a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f8783a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
