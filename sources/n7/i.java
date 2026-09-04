package n7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class i extends d0 implements ListIterator {
    public final int f16638a;
    public int f16639b;
    public final m f16640c;

    public i(m mVar, int i10) {
        int size = mVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f16638a = size;
            this.f16639b = i10;
            this.f16640c = mVar;
            return;
        }
        throw new IndexOutOfBoundsException(a.n(i10, size, "index"));
    }

    public final Object a(int i10) {
        return this.f16640c.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f16639b < this.f16638a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f16639b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f16639b;
            this.f16639b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f16639b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f16639b - 1;
            this.f16639b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f16639b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
