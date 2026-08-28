package b7;

import f7.i0;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class t extends x implements ListIterator {
    public final int f1586b;
    public int f1587c;
    public final v d;

    public t(v vVar, int i9) {
        super(0);
        int size = vVar.size();
        if (i9 >= 0 && i9 <= size) {
            this.f1586b = size;
            this.f1587c = i9;
            this.d = vVar;
            return;
        }
        throw new IndexOutOfBoundsException(i0.c(i9, size, "index"));
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
        if (this.f1587c < this.f1586b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f1587c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i9 = this.f1587c;
            this.f1587c = i9 + 1;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f1587c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.f1587c - 1;
            this.f1587c = i9;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f1587c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
