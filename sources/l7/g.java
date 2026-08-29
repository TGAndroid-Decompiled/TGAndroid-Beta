package l7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class g extends com.google.android.gms.internal.cast.v0 implements ListIterator {
    public final int f14583b;
    public int f14584c;
    public final i d;

    public g(i iVar, int i10) {
        super(8);
        int size = iVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f14583b = size;
            this.f14584c = i10;
            this.d = iVar;
            return;
        }
        throw new IndexOutOfBoundsException(i7.r.c(i10, size, "index"));
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
        if (this.f14584c < this.f14583b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f14584c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f14584c;
            this.f14584c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f14584c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f14584c - 1;
            this.f14584c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f14584c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
