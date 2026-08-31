package i7;

import com.google.android.gms.internal.cast.t0;
import j7.d8;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class b extends t0 implements ListIterator {
    public final int f7916b;
    public int f7917c;
    public final d d;

    public b(d dVar, int i10) {
        super(4);
        int size = dVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f7916b = size;
            this.f7917c = i10;
            this.d = dVar;
            return;
        }
        throw new IndexOutOfBoundsException(d8.c(i10, size, "index"));
    }

    public final Object a(int i10) {
        return this.d.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f7917c < this.f7916b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f7917c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f7917c;
            this.f7917c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f7917c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f7917c - 1;
            this.f7917c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f7917c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
