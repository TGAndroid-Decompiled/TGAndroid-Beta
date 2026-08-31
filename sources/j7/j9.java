package j7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class j9 extends com.google.android.gms.internal.cast.t0 implements ListIterator {
    public final int f9667b;
    public int f9668c;
    public final l9 d;

    public j9(l9 l9Var, int i10) {
        super(5);
        int size = l9Var.size();
        if (i10 >= 0 && i10 <= size) {
            this.f9667b = size;
            this.f9668c = i10;
            this.d = l9Var;
            return;
        }
        throw new IndexOutOfBoundsException(k8.c(i10, size, "index"));
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
        if (this.f9668c < this.f9667b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f9668c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f9668c;
            this.f9668c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f9668c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f9668c - 1;
            this.f9668c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f9668c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
