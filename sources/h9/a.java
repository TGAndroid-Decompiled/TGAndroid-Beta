package h9;

import a8.ia;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public abstract class a extends h2 implements ListIterator {
    public final int f14285a;
    public int f14286b;

    public a(int i7, int i10) {
        ia.m(i10, i7);
        this.f14285a = i7;
        this.f14286b = i10;
    }

    public abstract Object a(int i7);

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f14286b < this.f14285a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f14286b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f14286b;
            this.f14286b = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f14286b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f14286b - 1;
            this.f14286b = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f14286b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
