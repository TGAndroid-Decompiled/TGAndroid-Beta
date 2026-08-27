package k7;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class g extends c7.w implements ListIterator {

    public final int f14578b;

    public int f14579c;
    public final i d;

    public g(i iVar, int i10) {
        super(8);
        int size = iVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(g7.f9.d(i10, size, "index"));
        }
        this.f14578b = size;
        this.f14579c = i10;
        this.d = iVar;
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
        return this.f14579c < this.f14578b;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f14579c > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f14579c;
        this.f14579c = i10 + 1;
        return a(i10);
    }

    @Override
    public final int nextIndex() {
        return this.f14579c;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f14579c - 1;
        this.f14579c = i10;
        return a(i10);
    }

    @Override
    public final int previousIndex() {
        return this.f14579c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
