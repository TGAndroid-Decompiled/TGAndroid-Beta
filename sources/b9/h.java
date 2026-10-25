package b9;

import a8.w1;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class h extends a8.y implements ListIterator {
    public final int f3698b;
    public int f3699c;
    public final j d;

    public h(j jVar, int i10) {
        super(1);
        int size = jVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f3698b = size;
            this.f3699c = i10;
            this.d = jVar;
            return;
        }
        throw new IndexOutOfBoundsException(w1.c(i10, size, "index"));
    }

    public final Object a(int i10) {
        return this.d.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f3699c < this.f3698b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f3699c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f3699c;
            this.f3699c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f3699c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f3699c - 1;
            this.f3699c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f3699c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
