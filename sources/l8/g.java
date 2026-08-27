package l8;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class g extends c7.w implements ListIterator {

    public final int f15467b;

    public int f15468c;
    public final i d;

    public g(i iVar, int i10) {
        super(9);
        int size = iVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(h7.i.c(i10, size, "index"));
        }
        this.f15467b = size;
        this.f15468c = i10;
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
        return this.f15468c < this.f15467b;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f15468c > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f15468c;
        this.f15468c = i10 + 1;
        return a(i10);
    }

    @Override
    public final int nextIndex() {
        return this.f15468c;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f15468c - 1;
        this.f15468c = i10;
        return a(i10);
    }

    @Override
    public final int previousIndex() {
        return this.f15468c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
