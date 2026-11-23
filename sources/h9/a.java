package h9;

import a8.ma;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public abstract class a extends g2 implements ListIterator {
    public final int f13956a;
    public int f13957b;

    public a(int i7, int i10) {
        ma.m(i10, i7);
        this.f13956a = i7;
        this.f13957b = i10;
    }

    public abstract Object a(int i7);

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f13957b < this.f13956a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f13957b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f13957b;
            this.f13957b = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f13957b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f13957b - 1;
            this.f13957b = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f13957b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
