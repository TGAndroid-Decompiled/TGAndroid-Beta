package e9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class g1 extends l2 implements ListIterator {
    public final int f6364b;
    public final AbstractList f6365c;

    public g1(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f6364b = i10;
        this.f6365c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f6364b) {
            case 0:
                return ((h1) this.f6365c).f6369b.apply(obj);
            default:
                return ((i1) this.f6365c).f6374b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f6382a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f6382a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f6382a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f6382a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
