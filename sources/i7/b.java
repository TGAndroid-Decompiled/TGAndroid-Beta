package i7;

import com.google.android.gms.internal.cast.u0;
import j7.c8;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class b extends u0 implements ListIterator {
    public final int f7357b;
    public int f7358c;
    public final d d;

    public b(d dVar, int i10) {
        super(4);
        int size = dVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f7357b = size;
            this.f7358c = i10;
            this.d = dVar;
            return;
        }
        throw new IndexOutOfBoundsException(c8.c(i10, size, "index"));
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
        if (this.f7358c < this.f7357b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f7358c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f7358c;
            this.f7358c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f7358c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f7358c - 1;
            this.f7358c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f7358c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
