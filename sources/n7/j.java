package n7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class j extends e0 implements ListIterator {
    public final int f13961a;
    public int f13962b;
    public final n f13963c;

    public j(n nVar, int i10) {
        int size = nVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f13961a = size;
            this.f13962b = i10;
            this.f13963c = nVar;
            return;
        }
        throw new IndexOutOfBoundsException(a.n(i10, size, "index"));
    }

    public final Object a(int i10) {
        return this.f13963c.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f13962b < this.f13961a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f13962b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f13962b;
            this.f13962b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f13962b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f13962b - 1;
            this.f13962b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f13962b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
