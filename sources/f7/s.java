package f7;

import com.google.android.gms.internal.cast.u0;
import j7.l7;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class s extends u0 implements ListIterator {
    public final int f6042b;
    public int f6043c;
    public final u d;

    public s(u uVar, int i10) {
        super(2);
        int size = uVar.size();
        if (i10 >= 0 && i10 <= size) {
            this.f6042b = size;
            this.f6043c = i10;
            this.d = uVar;
            return;
        }
        throw new IndexOutOfBoundsException(l7.c(i10, size, "index"));
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
        if (this.f6043c < this.f6042b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f6043c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f6043c;
            this.f6043c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f6043c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f6043c - 1;
            this.f6043c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f6043c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
