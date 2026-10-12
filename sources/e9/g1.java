package e9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class g1 extends l2 implements ListIterator {
    public final int f8566b;
    public final AbstractList f8567c;

    public g1(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f8566b = i10;
        this.f8567c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f8566b) {
            case 0:
                return ((h1) this.f8567c).f8571b.apply(obj);
            default:
                return ((i1) this.f8567c).f8576b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f8584a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f8584a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f8584a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f8584a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
