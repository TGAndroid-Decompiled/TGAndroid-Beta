package d7;

import b7.x;
import f7.r6;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class b extends x implements ListIterator {
    public final int f4420b;
    public int f4421c;
    public final d d;

    public b(d dVar, int i9) {
        super(3);
        int size = dVar.size();
        r6.b(i9, size);
        this.f4420b = size;
        this.f4421c = i9;
        this.d = dVar;
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
        if (this.f4421c < this.f4420b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f4421c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i9 = this.f4421c;
            this.f4421c = i9 + 1;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f4421c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.f4421c - 1;
            this.f4421c = i9;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f4421c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
