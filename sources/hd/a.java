package hd;

import a8.p0;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class a extends cd.b implements ListIterator {
    public final c d;

    public a(c cVar, int i7) {
        super(cVar);
        this.d = cVar;
        int f10 = cVar.f();
        if (i7 >= 0 && i7 <= f10) {
            this.f6084b = i7;
            return;
        }
        throw new IndexOutOfBoundsException(p0.m(i7, f10, "index: ", ", size: "));
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f6084b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int nextIndex() {
        return this.f6084b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f6084b - 1;
            this.f6084b = i7;
            return this.d.get(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f6084b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
