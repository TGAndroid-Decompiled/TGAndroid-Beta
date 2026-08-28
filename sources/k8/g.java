package k8;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class g extends b7.x implements ListIterator {
    public final int f14685b;
    public int f14686c;
    public final i d;

    public g(i iVar, int i9) {
        super(9);
        int size = iVar.size();
        if (i9 >= 0 && i9 <= size) {
            this.f14685b = size;
            this.f14686c = i9;
            this.d = iVar;
            return;
        }
        throw new IndexOutOfBoundsException(g7.h.c(i9, size, "index"));
    }

    public final Object a(int i9) {
        return this.d.get(i9);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f14686c < this.f14685b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f14686c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i9 = this.f14686c;
            this.f14686c = i9 + 1;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f14686c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.f14686c - 1;
            this.f14686c = i9;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f14686c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
