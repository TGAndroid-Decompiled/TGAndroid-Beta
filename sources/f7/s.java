package f7;

import com.google.android.gms.internal.cast.t0;
import j7.m7;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class s extends t0 implements ListIterator {
    public final int f6153b;
    public int f6154c;
    public final u d;

    public s(u uVar, int i10) {
        super(2);
        int size = uVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f6153b = size;
            this.f6154c = i10;
            this.d = uVar;
            return;
        }
        throw new IndexOutOfBoundsException(m7.c(i10, size, "index"));
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
        if (this.f6154c < this.f6153b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f6154c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f6154c;
            this.f6154c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f6154c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f6154c - 1;
            this.f6154c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f6154c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
