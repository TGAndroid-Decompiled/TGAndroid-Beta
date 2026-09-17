package hd;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class a extends cd.b implements ListIterator {
    public final c d;

    public a(c cVar, int i10) {
        super(cVar);
        this.d = cVar;
        int i11 = cVar.i();
        if (i10 >= 0 && i10 <= i11) {
            this.f4780b = i10;
            return;
        }
        throw new IndexOutOfBoundsException(a4.a.l(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f4780b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int nextIndex() {
        return this.f4780b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f4780b - 1;
            this.f4780b = i10;
            return this.d.get(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f4780b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
