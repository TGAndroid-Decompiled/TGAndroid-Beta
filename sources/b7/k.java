package b7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class k extends g0 implements ListIterator {
    public final int f1831a;
    public int f1832b;
    public final o f1833c;

    public k(o oVar, int i10) {
        int size = oVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f1831a = size;
            this.f1832b = i10;
            this.f1833c = oVar;
            return;
        }
        throw new IndexOutOfBoundsException(b.n(i10, size, "index"));
    }

    public final Object a(int i10) {
        return this.f1833c.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f1832b < this.f1831a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f1832b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f1832b;
            this.f1832b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f1832b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f1832b - 1;
            this.f1832b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f1832b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
