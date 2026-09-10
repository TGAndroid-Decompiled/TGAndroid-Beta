package e9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class q0 extends n1 implements ListIterator {
    public final int f7418b;
    public final AbstractList f7419c;

    public q0(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f7418b = i10;
        this.f7419c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f7418b) {
            case 0:
                return ((r0) this.f7419c).f7422b.apply(obj);
            default:
                return ((s0) this.f7419c).f7426b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f7407a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f7407a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f7407a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f7407a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
