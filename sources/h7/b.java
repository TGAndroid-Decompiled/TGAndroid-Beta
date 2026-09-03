package h7;

import com.google.android.gms.internal.cast.u0;
import j7.t7;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class b extends u0 implements ListIterator {
    public final int f6999b;
    public int f7000c;
    public final d d;

    public b(d dVar, int i10) {
        super(3);
        int size = dVar.size();
        t7.b(i10, size);
        this.f6999b = size;
        this.f7000c = i10;
        this.d = dVar;
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
        if (this.f7000c < this.f6999b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f7000c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f7000c;
            this.f7000c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f7000c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f7000c - 1;
            this.f7000c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f7000c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
