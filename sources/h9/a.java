package h9;

import a8.la;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public abstract class a extends h2 implements ListIterator {
    public final int f13959a;
    public int f13960b;

    public a(int i7, int i10) {
        la.m(i10, i7);
        this.f13959a = i7;
        this.f13960b = i10;
    }

    public abstract Object a(int i7);

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f13960b < this.f13959a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f13960b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f13960b;
            this.f13960b = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f13960b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f13960b - 1;
            this.f13960b = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f13960b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
