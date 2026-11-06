package a8;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class s extends i0 implements ListIterator {
    public final int f623b;
    public int f624c;
    public final u d;

    public s(u uVar, int i7) {
        super(0);
        int size = uVar.size();
        if (i7 >= 0 && i7 <= size) {
            this.f623b = size;
            this.f624c = i7;
            this.d = uVar;
            return;
        }
        throw new IndexOutOfBoundsException(x0.c(i7, size, "index"));
    }

    public final Object a(int i7) {
        return this.d.get(i7);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f624c < this.f623b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f624c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f624c;
            this.f624c = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f624c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f624c - 1;
            this.f624c = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f624c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
