package gd;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b implements Iterator {

    public final String f6840a;

    public int f6841b;

    public int f6842c;
    public int d;

    public int f6843e;

    public b(String str) {
        this.f6840a = str;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f6841b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f6843e < 0) {
            this.f6841b = 2;
            return false;
        }
        String str = this.f6840a;
        int length = str.length();
        int length2 = str.length();
        for (int i13 = this.f6842c; i13 < length2; i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < str.length() && str.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f6841b = 1;
                this.f6843e = i10;
                this.d = length;
                return true;
            }
        }
        i10 = -1;
        this.f6841b = 1;
        this.f6843e = i10;
        this.d = length;
        return true;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6841b = 0;
        int i10 = this.d;
        int i11 = this.f6842c;
        this.f6842c = this.f6843e + i10;
        return this.f6840a.subSequence(i11, i10).toString();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
