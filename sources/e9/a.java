package e9;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import v7.u6;
public abstract class a extends m2 implements ListIterator {
    public final int f8413a;
    public int f8414b;

    public a(int i10, int i11) {
        u6.m(i11, i10);
        this.f8413a = i10;
        this.f8414b = i11;
    }

    public abstract Object a(int i10);

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f8414b < this.f8413a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f8414b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f8414b;
            this.f8414b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f8414b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f8414b - 1;
            this.f8414b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f8414b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
