package j7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class q extends com.google.android.gms.internal.cast.v0 implements ListIterator {
    public final int f11151b;
    public int f11152c;
    public final s d;

    public q(s sVar, int i10) {
        super(7);
        int size = sVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f11151b = size;
            this.f11152c = i10;
            this.d = sVar;
            return;
        }
        throw new IndexOutOfBoundsException(h7.u8.c(i10, size, "index"));
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
        if (this.f11152c < this.f11151b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f11152c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f11152c;
            this.f11152c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f11152c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f11152c - 1;
            this.f11152c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f11152c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
