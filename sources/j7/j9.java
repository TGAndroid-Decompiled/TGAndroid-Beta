package j7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class j9 extends com.google.android.gms.internal.cast.u0 implements ListIterator {
    public final int f9034b;
    public int f9035c;
    public final l9 d;

    public j9(l9 l9Var, int i10) {
        super(5);
        int size = l9Var.size();
        if (i10 >= 0 && i10 <= size) {
            this.f9034b = size;
            this.f9035c = i10;
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
        if (this.f9035c < this.f9034b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f9035c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f9035c;
            this.f9035c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f9035c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f9035c - 1;
            this.f9035c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f9035c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
