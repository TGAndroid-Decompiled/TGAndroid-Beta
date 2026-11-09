package c8;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class g extends a8.i0 implements ListIterator {
    public final int f5672b;
    public int f5673c;
    public final i d;

    public g(i iVar, int i7) {
        super(1);
        int size = iVar.size();
        if (i7 >= 0 && i7 <= size) {
            this.f5672b = size;
            this.f5673c = i7;
            this.d = iVar;
            return;
        }
        throw new IndexOutOfBoundsException(a8.f8.c(i7, size, "index"));
    }

    public final Object a(int i7) {
        return this.d.get(i7);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f5673c < this.f5672b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f5673c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f5673c;
            this.f5673c = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f5673c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f5673c - 1;
            this.f5673c = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f5673c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
