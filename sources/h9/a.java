package h9;

import a8.ia;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public abstract class a extends h2 implements ListIterator {
    public final int f14287a;
    public int f14288b;

    public a(int i7, int i10) {
        ia.m(i10, i7);
        this.f14287a = i7;
        this.f14288b = i10;
    }

    public abstract Object a(int i7);

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f14288b < this.f14287a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f14288b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f14288b;
            this.f14288b = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f14288b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f14288b - 1;
            this.f14288b = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f14288b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
