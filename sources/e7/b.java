package e7;

import b7.x;
import f7.x6;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class b extends x implements ListIterator {
    public final int f4971b;
    public int f4972c;
    public final d d;

    public b(d dVar, int i9) {
        super(4);
        int size = dVar.size();
        if (i9 >= 0 && i9 <= size) {
            this.f4971b = size;
            this.f4972c = i9;
            this.d = dVar;
            return;
        }
        throw new IndexOutOfBoundsException(x6.c(i9, size, "index"));
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
        if (this.f4972c < this.f4971b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f4972c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i9 = this.f4972c;
            this.f4972c = i9 + 1;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f4972c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.f4972c - 1;
            this.f4972c = i9;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f4972c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
