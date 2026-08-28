package g7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class pa extends b7.x implements ListIterator {
    public final int f7341b;
    public int f7342c;
    public final ra d;

    public pa(ra raVar, int i9) {
        super(6);
        int size = raVar.size();
        if (i9 >= 0 && i9 <= size) {
            this.f7341b = size;
            this.f7342c = i9;
            this.d = raVar;
            return;
        }
        throw new IndexOutOfBoundsException(f7.p7.c(i9, size, "index"));
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
        if (this.f7342c < this.f7341b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f7342c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i9 = this.f7342c;
            this.f7342c = i9 + 1;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f7342c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.f7342c - 1;
            this.f7342c = i9;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f7342c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
