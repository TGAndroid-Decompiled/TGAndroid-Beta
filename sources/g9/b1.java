package g9;

import java.util.AbstractList;
import java.util.ListIterator;
public final class b1 extends f2 implements ListIterator {
    public final int f12055b;
    public final AbstractList f12056c;

    public b1(AbstractList abstractList, ListIterator listIterator, int i3) {
        super(listIterator);
        this.f12055b = i3;
        this.f12056c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f12055b) {
            case 0:
                return ((c1) this.f12056c).f12062b.apply(obj);
            default:
                return ((d1) this.f12056c).f12069b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f12076a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f12076a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f12076a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f12076a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
