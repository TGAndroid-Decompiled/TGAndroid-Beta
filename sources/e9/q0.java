package e9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class q0 extends n1 implements ListIterator {
    public final int f8101b;
    public final AbstractList f8102c;

    public q0(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f8101b = i10;
        this.f8102c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f8101b) {
            case 0:
                return ((r0) this.f8102c).f8105b.apply(obj);
            default:
                return ((s0) this.f8102c).f8109b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f8090a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f8090a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f8090a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f8090a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
