package dd;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b implements Iterator {

    public final int f4910a = 0;

    public final int f4911b;

    public final int f4912c;
    public boolean d;

    public int f4913e;

    public b(char c10, char c11, int i10) {
        boolean z10 = false;
        this.f4911b = i10;
        this.f4912c = c11;
        if (i10 <= 0 ? c10 >= c11 : c10 < c11 || c10 == c11) {
            z10 = true;
        }
        this.d = z10;
        this.f4913e = z10 ? c10 : c11;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f4910a) {
            case 0:
                break;
        }
        return this.d;
    }

    @Override
    public final Object next() {
        switch (this.f4910a) {
            case 0:
                int i10 = this.f4913e;
                if (i10 != this.f4912c) {
                    this.f4913e = this.f4911b + i10;
                } else {
                    if (!this.d) {
                        throw new NoSuchElementException();
                    }
                    this.d = false;
                }
                return Character.valueOf((char) i10);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i10 = this.f4913e;
        if (i10 != this.f4912c) {
            this.f4913e = this.f4911b + i10;
            return i10;
        }
        if (!this.d) {
            throw new NoSuchElementException();
        }
        this.d = false;
        return i10;
    }

    @Override
    public final void remove() {
        switch (this.f4910a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(int i10, int i11, int i12) {
        this.f4911b = i12;
        this.f4912c = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.d = z10;
        this.f4913e = z10 ? i10 : i11;
    }
}
