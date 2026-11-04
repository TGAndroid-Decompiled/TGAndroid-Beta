package ed;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class b extends a implements ListIterator {
    public final d d;

    public b(d dVar, int i3) {
        super(dVar);
        this.d = dVar;
        int h = dVar.h();
        if (i3 >= 0 && i3 <= h) {
            this.f9944b = i3;
            return;
        }
        throw new IndexOutOfBoundsException(a1.g.n(i3, h, "index: ", ", size: "));
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f9944b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int nextIndex() {
        return this.f9944b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i3 = this.f9944b - 1;
            this.f9944b = i3;
            return this.d.get(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f9944b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
