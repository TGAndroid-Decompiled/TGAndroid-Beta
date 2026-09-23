package n7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class j extends e0 implements ListIterator {
    public final int f15106a;
    public int f15107b;
    public final n f15108c;

    public j(n nVar, int i10) {
        int size = nVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f15106a = size;
            this.f15107b = i10;
            this.f15108c = nVar;
            return;
        }
        throw new IndexOutOfBoundsException(a.n(i10, size, "index"));
    }

    public final Object a(int i10) {
        return this.f15108c.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f15107b < this.f15106a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f15107b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f15107b;
            this.f15107b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f15107b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f15107b - 1;
            this.f15107b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f15107b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
