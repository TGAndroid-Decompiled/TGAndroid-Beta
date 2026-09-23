package e9;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import v7.t6;
public final class g0 extends o1 implements ListIterator {
    public final int f8057a;
    public int f8058b;
    public final i0 f8059c;

    public g0(i0 i0Var, int i10) {
        int size = i0Var.size();
        t6.e(i10, size);
        this.f8057a = size;
        this.f8058b = i10;
        this.f8059c = i0Var;
    }

    public final Object a(int i10) {
        return this.f8059c.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f8058b < this.f8057a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f8058b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f8058b;
            this.f8058b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f8058b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f8058b - 1;
            this.f8058b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f8058b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
