package i7;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class q extends c7.w implements ListIterator {

    public final int f10781b;

    public int f10782c;
    public final s d;

    public q(s sVar, int i10) {
        super(7);
        int size = sVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(g7.g8.c(i10, size, "index"));
        }
        this.f10781b = size;
        this.f10782c = i10;
        this.d = sVar;
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
        return this.f10782c < this.f10781b;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f10782c > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f10782c;
        this.f10782c = i10 + 1;
        return a(i10);
    }

    @Override
    public final int nextIndex() {
        return this.f10782c;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f10782c - 1;
        this.f10782c = i10;
        return a(i10);
    }

    @Override
    public final int previousIndex() {
        return this.f10782c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
