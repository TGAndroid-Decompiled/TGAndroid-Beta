package h9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class b1 extends f2 implements ListIterator {
    public final int f13967b;
    public final AbstractList f13968c;

    public b1(AbstractList abstractList, ListIterator listIterator, int i7) {
        super(listIterator);
        this.f13967b = i7;
        this.f13968c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f13967b) {
            case 0:
                return ((c1) this.f13968c).f13974b.apply(obj);
            default:
                return ((d1) this.f13968c).f13981b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f13988a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f13988a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f13988a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f13988a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
