package e7;

import c7.w;
import g7.s6;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class b extends w implements ListIterator {

    public final int f5315b;

    public int f5316c;
    public final d d;

    public b(d dVar, int i10) {
        super(3);
        int size = dVar.size();
        s6.b(i10, size);
        this.f5315b = size;
        this.f5316c = i10;
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
        return this.f5316c < this.f5315b;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f5316c > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f5316c;
        this.f5316c = i10 + 1;
        return a(i10);
    }

    @Override
    public final int nextIndex() {
        return this.f5316c;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f5316c - 1;
        this.f5316c = i10;
        return a(i10);
    }

    @Override
    public final int previousIndex() {
        return this.f5316c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
