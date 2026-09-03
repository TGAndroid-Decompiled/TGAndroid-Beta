package gd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class b implements Iterator {
    public final int f6522a = 0;
    public final int f6523b;
    public final int f6524c;
    public boolean d;
    public int e;

    public b(char c3, char c10, int i10) {
        boolean z4 = false;
        this.f6523b = i10;
        this.f6524c = c10;
        if (i10 <= 0 ? c3 >= c10 : c3 < c10 || c3 == c10) {
            z4 = true;
        }
        this.d = z4;
        this.e = z4 ? c3 : c10;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f6522a) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override
    public final Object next() {
        switch (this.f6522a) {
            case 0:
                int i10 = this.e;
                if (i10 == this.f6524c) {
                    if (this.d) {
                        this.d = false;
                    } else {
                        throw new NoSuchElementException();
                    }
                } else {
                    this.e = this.f6523b + i10;
                }
                return Character.valueOf((char) i10);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i10 = this.e;
        if (i10 == this.f6524c) {
            if (this.d) {
                this.d = false;
                return i10;
            }
            throw new NoSuchElementException();
        }
        this.e = this.f6523b + i10;
        return i10;
    }

    @Override
    public final void remove() {
        switch (this.f6522a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(int i10, int i11, int i12) {
        this.f6523b = i12;
        this.f6524c = i11;
        boolean z4 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z4 = true;
        }
        this.d = z4;
        this.e = z4 ? i10 : i11;
    }
}
