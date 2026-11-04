package b8;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class j extends y implements ListIterator {
    public final int f2684b;
    public int f2685c;
    public final l d;

    public j(l lVar, int i3) {
        super(0);
        int size = lVar.size();
        if (i3 >= 0 && i3 <= size) {
            this.f2684b = size;
            this.f2685c = i3;
            this.d = lVar;
            return;
        }
        throw new IndexOutOfBoundsException(n1.c(i3, size, "index"));
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
        if (this.f2685c < this.f2684b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f2685c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i3 = this.f2685c;
            this.f2685c = i3 + 1;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f2685c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i3 = this.f2685c - 1;
            this.f2685c = i3;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f2685c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
