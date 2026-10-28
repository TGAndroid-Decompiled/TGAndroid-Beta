package f9;

import a8.yb;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public abstract class a extends g2 implements ListIterator {
    public final int f10250a;
    public int f10251b;

    public a(int i10, int i11) {
        yb.m(i11, i10);
        this.f10250a = i10;
        this.f10251b = i11;
    }

    public abstract Object a(int i10);

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f10251b < this.f10250a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f10251b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f10251b;
            this.f10251b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f10251b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f10251b - 1;
            this.f10251b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f10251b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
