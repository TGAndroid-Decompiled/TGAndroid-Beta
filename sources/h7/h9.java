package h7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class h9 extends com.google.android.gms.internal.cast.v0 implements ListIterator {
    public final int f7641b;
    public int f7642c;
    public final j9 d;

    public h9(j9 j9Var, int i10) {
        super(5);
        int size = j9Var.size();
        if (i10 >= 0 && i10 <= size) {
            this.f7641b = size;
            this.f7642c = i10;
            this.d = j9Var;
            return;
        }
        throw new IndexOutOfBoundsException(t7.c(i10, size, "index"));
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
        if (this.f7642c < this.f7641b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f7642c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f7642c;
            this.f7642c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f7642c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f7642c - 1;
            this.f7642c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f7642c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
