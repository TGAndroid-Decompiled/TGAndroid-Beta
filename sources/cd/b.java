package cd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class b implements Iterator {
    public final int f2366a = 0;
    public final int f2367b;
    public final int f2368c;
    public boolean d;
    public int f2369e;

    public b(char c10, char c11, int i9) {
        boolean z10 = false;
        this.f2367b = i9;
        this.f2368c = c11;
        if (i9 <= 0 ? c10 >= c11 : c10 < c11 || c10 == c11) {
            z10 = true;
        }
        this.d = z10;
        this.f2369e = z10 ? c10 : c11;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f2366a) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override
    public final Object next() {
        switch (this.f2366a) {
            case 0:
                int i9 = this.f2369e;
                if (i9 == this.f2368c) {
                    if (this.d) {
                        this.d = false;
                    } else {
                        throw new NoSuchElementException();
                    }
                } else {
                    this.f2369e = this.f2367b + i9;
                }
                return Character.valueOf((char) i9);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i9 = this.f2369e;
        if (i9 == this.f2368c) {
            if (this.d) {
                this.d = false;
                return i9;
            }
            throw new NoSuchElementException();
        }
        this.f2369e = this.f2367b + i9;
        return i9;
    }

    @Override
    public final void remove() {
        switch (this.f2366a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(int i9, int i10, int i11) {
        this.f2367b = i11;
        this.f2368c = i10;
        boolean z10 = false;
        if (i11 <= 0 ? i9 >= i10 : i9 <= i10) {
            z10 = true;
        }
        this.d = z10;
        this.f2369e = z10 ? i9 : i10;
    }
}
