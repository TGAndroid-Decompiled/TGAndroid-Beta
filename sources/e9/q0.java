package e9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class q0 extends n1 implements ListIterator {
    public final int f8102b;
    public final AbstractList f8103c;

    public q0(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f8102b = i10;
        this.f8103c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f8102b) {
            case 0:
                return ((r0) this.f8103c).f8106b.apply(obj);
            default:
                return ((s0) this.f8103c).f8110b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f8091a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f8091a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f8091a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f8091a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
