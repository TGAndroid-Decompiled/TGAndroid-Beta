package e9;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import v7.t6;
public final class g0 extends o1 implements ListIterator {
    public final int f8945a;
    public int f8946b;
    public final i0 f8947c;

    public g0(i0 i0Var, int i10) {
        int size = i0Var.size();
        t6.e(i10, size);
        this.f8945a = size;
        this.f8946b = i10;
        this.f8947c = i0Var;
    }

    public final Object a(int i10) {
        return this.f8947c.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f8946b < this.f8945a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f8946b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f8946b;
            this.f8946b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f8946b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f8946b - 1;
            this.f8946b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f8946b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
