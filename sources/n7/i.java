package n7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class i extends d0 implements ListIterator {
    public final int f16184a;
    public int f16185b;
    public final m f16186c;

    public i(m mVar, int i10) {
        int size = mVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f16184a = size;
            this.f16185b = i10;
            this.f16186c = mVar;
            return;
        }
        throw new IndexOutOfBoundsException(a.n(i10, size, "index"));
    }

    public final Object a(int i10) {
        return this.f16186c.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f16185b < this.f16184a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f16185b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f16185b;
            this.f16185b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f16185b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f16185b - 1;
            this.f16185b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f16185b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
