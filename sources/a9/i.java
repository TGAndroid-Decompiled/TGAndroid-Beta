package a9;

import com.google.android.gms.internal.play_billing.s1;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class i extends o implements ListIterator {
    public final int f358b;
    public int f359c;
    public final k d;

    public i(k kVar, int i10) {
        super(0);
        int size = kVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f358b = size;
            this.f359c = i10;
            this.d = kVar;
            return;
        }
        throw new IndexOutOfBoundsException(s1.c(i10, size, "index"));
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
        if (this.f359c < this.f358b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f359c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f359c;
            this.f359c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f359c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f359c - 1;
            this.f359c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f359c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
