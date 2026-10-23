package e9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class g1 extends l2 implements ListIterator {
    public final int f8455b;
    public final AbstractList f8456c;

    public g1(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f8455b = i10;
        this.f8456c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f8455b) {
            case 0:
                return ((h1) this.f8456c).f8460b.apply(obj);
            default:
                return ((i1) this.f8456c).f8465b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f8473a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f8473a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f8473a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f8473a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
