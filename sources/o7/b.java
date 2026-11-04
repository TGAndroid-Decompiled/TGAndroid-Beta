package o7;

import b8.bf;
import b8.y;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class b extends y implements ListIterator {
    public final int f20918b;
    public int f20919c;
    public final e d;

    public b(e eVar, int i3) {
        super(4);
        int size = eVar.size();
        if (i3 >= 0 && i3 <= size) {
            this.f20918b = size;
            this.f20919c = i3;
            this.d = eVar;
            return;
        }
        throw new IndexOutOfBoundsException(bf.c(i3, size, "index"));
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
        if (this.f20919c < this.f20918b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f20919c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i3 = this.f20919c;
            this.f20919c = i3 + 1;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f20919c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i3 = this.f20919c - 1;
            this.f20919c = i3;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f20919c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
