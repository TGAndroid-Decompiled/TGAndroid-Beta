package e9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class q0 extends n1 implements ListIterator {
    public final int f8113b;
    public final AbstractList f8114c;

    public q0(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f8113b = i10;
        this.f8114c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f8113b) {
            case 0:
                return ((r0) this.f8114c).f8117b.apply(obj);
            default:
                return ((s0) this.f8114c).f8121b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f8102a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f8102a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f8102a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f8102a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
