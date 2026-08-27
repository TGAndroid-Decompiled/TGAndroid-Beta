package h7;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class pa extends c7.w implements ListIterator {

    public final int f8514b;

    public int f8515c;
    public final ra d;

    public pa(ra raVar, int i10) {
        super(6);
        int size = raVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(g7.r7.c(i10, size, "index"));
        }
        this.f8514b = size;
        this.f8515c = i10;
        this.d = raVar;
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
        return this.f8515c < this.f8514b;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f8515c > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f8515c;
        this.f8515c = i10 + 1;
        return a(i10);
    }

    @Override
    public final int nextIndex() {
        return this.f8515c;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f8515c - 1;
        this.f8515c = i10;
        return a(i10);
    }

    @Override
    public final int previousIndex() {
        return this.f8515c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
