package d7;

import com.google.android.gms.internal.cast.v0;
import h7.z6;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class r extends v0 implements ListIterator {
    public final int f5461b;
    public int f5462c;
    public final t d;

    public r(t tVar, int i10) {
        super(2);
        int size = tVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f5461b = size;
            this.f5462c = i10;
            this.d = tVar;
            return;
        }
        throw new IndexOutOfBoundsException(z6.c(i10, size, "index"));
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
        if (this.f5462c < this.f5461b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f5462c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f5462c;
            this.f5462c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f5462c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f5462c - 1;
            this.f5462c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f5462c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
