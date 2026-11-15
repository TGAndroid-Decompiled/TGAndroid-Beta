package h9;

import a8.ja;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public abstract class a extends g2 implements ListIterator {
    public final int f13647a;
    public int f13648b;

    public a(int i7, int i10) {
        ja.m(i10, i7);
        this.f13647a = i7;
        this.f13648b = i10;
    }

    public abstract Object a(int i7);

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f13648b < this.f13647a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f13648b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f13648b;
            this.f13648b = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f13648b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f13648b - 1;
            this.f13648b = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f13648b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
