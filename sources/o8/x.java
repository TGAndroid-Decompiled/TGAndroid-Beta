package o8;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class x extends x0 implements ListIterator {
    public final int f19100a;
    public int f19101b;
    public final z f19102c;

    public x(z zVar, int i9) {
        int size = zVar.size();
        g7.d0.c(i9, size);
        this.f19100a = size;
        this.f19101b = i9;
        this.f19102c = zVar;
    }

    public final Object a(int i9) {
        return this.f19102c.get(i9);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f19101b < this.f19100a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f19101b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i9 = this.f19101b;
            this.f19101b = i9 + 1;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f19101b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.f19101b - 1;
            this.f19101b = i9;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f19101b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
