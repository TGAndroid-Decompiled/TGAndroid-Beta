package g9;

import b8.zb;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public abstract class a extends g2 implements ListIterator {
    public final int f12044a;
    public int f12045b;

    public a(int i3, int i10) {
        zb.m(i10, i3);
        this.f12044a = i3;
        this.f12045b = i10;
    }

    public abstract Object a(int i3);

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f12045b < this.f12044a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f12045b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i3 = this.f12045b;
            this.f12045b = i3 + 1;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f12045b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i3 = this.f12045b - 1;
            this.f12045b = i3;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f12045b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
