package a8;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class s extends i0 implements ListIterator {
    public final int f626b;
    public int f627c;
    public final u d;

    public s(u uVar, int i7) {
        super(0);
        int size = uVar.size();
        if (i7 >= 0 && i7 <= size) {
            this.f626b = size;
            this.f627c = i7;
            this.d = uVar;
            return;
        }
        throw new IndexOutOfBoundsException(x0.c(i7, size, "index"));
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
        if (this.f627c < this.f626b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f627c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f627c;
            this.f627c = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f627c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f627c - 1;
            this.f627c = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f627c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
