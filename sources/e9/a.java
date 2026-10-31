package e9;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import v7.t6;
public abstract class a extends m2 implements ListIterator {
    public final int f6322a;
    public int f6323b;

    public a(int i10, int i11) {
        t6.m(i11, i10);
        this.f6322a = i10;
        this.f6323b = i11;
    }

    public abstract Object a(int i10);

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f6323b < this.f6322a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f6323b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f6323b;
            this.f6323b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f6323b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f6323b - 1;
            this.f6323b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f6323b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
