package bd;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class c extends b implements ListIterator {
    public final e d;

    public c(e eVar, int i10) {
        super(eVar);
        this.d = eVar;
        int l4 = eVar.l();
        if (i10 >= 0 && i10 <= l4) {
            this.f2649b = i10;
            return;
        }
        throw new IndexOutOfBoundsException(a1.g.j(i10, l4, "index: ", ", size: "));
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f2649b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int nextIndex() {
        return this.f2649b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f2649b - 1;
            this.f2649b = i10;
            return this.d.get(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f2649b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
