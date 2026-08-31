package k7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class pa extends com.google.android.gms.internal.cast.t0 implements ListIterator {
    public final int f10696b;
    public int f10697c;
    public final ra d;

    public pa(ra raVar, int i10) {
        super(6);
        int size = raVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f10696b = size;
            this.f10697c = i10;
            this.d = raVar;
            return;
        }
        throw new IndexOutOfBoundsException(j7.u8.c(i10, size, "index"));
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
        if (this.f10697c < this.f10696b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f10697c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f10697c;
            this.f10697c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f10697c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f10697c - 1;
            this.f10697c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f10697c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
