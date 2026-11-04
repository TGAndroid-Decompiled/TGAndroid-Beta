package c9;

import b8.q9;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class g extends b8.y implements ListIterator {
    public final int f4261b;
    public int f4262c;
    public final i d;

    public g(i iVar, int i3) {
        super(1);
        int size = iVar.size();
        if (i3 >= 0 && i3 <= size) {
            this.f4261b = size;
            this.f4262c = i3;
            this.d = iVar;
            return;
        }
        throw new IndexOutOfBoundsException(q9.c(i3, size, "index"));
    }

    public final Object a(int i3) {
        return this.d.get(i3);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f4262c < this.f4261b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f4262c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i3 = this.f4262c;
            this.f4262c = i3 + 1;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f4262c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i3 = this.f4262c - 1;
            this.f4262c = i3;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f4262c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
