package m8;

import com.google.android.gms.internal.cast.v0;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class g extends v0 implements ListIterator {
    public final int f16906b;
    public int f16907c;
    public final i d;

    public g(i iVar, int i10) {
        super(9);
        int size = iVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f16906b = size;
            this.f16907c = i10;
            this.d = iVar;
            return;
        }
        throw new IndexOutOfBoundsException(i7.y.c(i10, size, "index"));
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
        if (this.f16907c < this.f16906b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f16907c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f16907c;
            this.f16907c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f16907c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f16907c - 1;
            this.f16907c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f16907c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
