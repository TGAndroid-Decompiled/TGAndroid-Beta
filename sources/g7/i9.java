package g7;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class i9 extends c7.w implements ListIterator {

    public final int f6506b;

    public int f6507c;
    public final k9 d;

    public i9(k9 k9Var, int i10) {
        super(5);
        int size = k9Var.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(c7.c(i10, size, "index"));
        }
        this.f6506b = size;
        this.f6507c = i10;
        this.d = k9Var;
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
        return this.f6507c < this.f6506b;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f6507c > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f6507c;
        this.f6507c = i10 + 1;
        return a(i10);
    }

    @Override
    public final int nextIndex() {
        return this.f6507c;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f6507c - 1;
        this.f6507c = i10;
        return a(i10);
    }

    @Override
    public final int previousIndex() {
        return this.f6507c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
