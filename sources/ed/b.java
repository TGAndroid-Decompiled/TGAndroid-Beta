package ed;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class b implements Iterator {
    public final int f5878a = 0;
    public final int f5879b;
    public final int f5880c;
    public boolean d;
    public int f5881e;

    public b(char c3, char c6, int i10) {
        boolean z10 = false;
        this.f5879b = i10;
        this.f5880c = c6;
        if (i10 <= 0 ? c3 >= c6 : c3 < c6 || c3 == c6) {
            z10 = true;
        }
        this.d = z10;
        this.f5881e = z10 ? c3 : c6;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f5878a) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override
    public final Object next() {
        switch (this.f5878a) {
            case 0:
                int i10 = this.f5881e;
                if (i10 == this.f5880c) {
                    if (this.d) {
                        this.d = false;
                    } else {
                        throw new NoSuchElementException();
                    }
                } else {
                    this.f5881e = this.f5879b + i10;
                }
                return Character.valueOf((char) i10);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i10 = this.f5881e;
        if (i10 == this.f5880c) {
            if (this.d) {
                this.d = false;
                return i10;
            }
            throw new NoSuchElementException();
        }
        this.f5881e = this.f5879b + i10;
        return i10;
    }

    @Override
    public final void remove() {
        switch (this.f5878a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(int i10, int i11, int i12) {
        this.f5879b = i12;
        this.f5880c = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.d = z10;
        this.f5881e = z10 ? i10 : i11;
    }
}
