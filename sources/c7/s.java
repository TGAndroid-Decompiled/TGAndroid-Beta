package c7;

import g7.j0;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class s extends w implements ListIterator {

    public final int f2492b;

    public int f2493c;
    public final u d;

    public s(u uVar, int i10) {
        super(0);
        int size = uVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(j0.c(i10, size, "index"));
        }
        this.f2492b = size;
        this.f2493c = i10;
        this.d = uVar;
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
        return this.f2493c < this.f2492b;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f2493c > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f2493c;
        this.f2493c = i10 + 1;
        return a(i10);
    }

    @Override
    public final int nextIndex() {
        return this.f2493c;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f2493c - 1;
        this.f2493c = i10;
        return a(i10);
    }

    @Override
    public final int previousIndex() {
        return this.f2493c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
