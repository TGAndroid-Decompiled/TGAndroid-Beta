package f7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class j9 extends b7.x implements ListIterator {
    public final int f5716b;
    public int f5717c;
    public final l9 d;

    public j9(l9 l9Var, int i9) {
        super(5);
        int size = l9Var.size();
        if (i9 >= 0 && i9 <= size) {
            this.f5716b = size;
            this.f5717c = i9;
            this.d = l9Var;
            return;
        }
        throw new IndexOutOfBoundsException(a7.c(i9, size, "index"));
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
        if (this.f5717c < this.f5716b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f5717c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i9 = this.f5717c;
            this.f5717c = i9 + 1;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f5717c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.f5717c - 1;
            this.f5717c = i9;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f5717c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
