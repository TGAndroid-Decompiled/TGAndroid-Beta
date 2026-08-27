package f7;

import c7.w;
import g7.x6;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class b extends w implements ListIterator {

    public final int f5900b;

    public int f5901c;
    public final d d;

    public b(d dVar, int i10) {
        super(4);
        int size = dVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(x6.c(i10, size, "index"));
        }
        this.f5900b = size;
        this.f5901c = i10;
        this.d = dVar;
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
        return this.f5901c < this.f5900b;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f5901c > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f5901c;
        this.f5901c = i10 + 1;
        return a(i10);
    }

    @Override
    public final int nextIndex() {
        return this.f5901c;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f5901c - 1;
        this.f5901c = i10;
        return a(i10);
    }

    @Override
    public final int previousIndex() {
        return this.f5901c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
