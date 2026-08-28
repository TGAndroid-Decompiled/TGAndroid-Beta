package h7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class q extends b7.x implements ListIterator {
    public final int f10072b;
    public int f10073c;
    public final s d;

    public q(s sVar, int i9) {
        super(7);
        int size = sVar.size();
        if (i9 >= 0 && i9 <= size) {
            this.f10072b = size;
            this.f10073c = i9;
            this.d = sVar;
            return;
        }
        throw new IndexOutOfBoundsException(f7.b8.c(i9, size, "index"));
    }

    public final Object a(int i9) {
        return this.d.get(i9);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f10073c < this.f10072b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f10073c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i9 = this.f10073c;
            this.f10073c = i9 + 1;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f10073c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.f10073c - 1;
            this.f10073c = i9;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f10073c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
