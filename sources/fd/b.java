package fd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class b implements Iterator {
    public final String f6040a;
    public int f6041b;
    public int f6042c;
    public int d;
    public int f6043e;

    public b(String str) {
        this.f6040a = str;
    }

    @Override
    public final boolean hasNext() {
        int i9;
        int i10 = this.f6041b;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        int i11 = 2;
        if (this.f6043e < 0) {
            this.f6041b = 2;
            return false;
        }
        String str = this.f6040a;
        int length = str.length();
        int length2 = str.length();
        for (int i12 = this.f6042c; i12 < length2; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '\n' || charAt == '\r') {
                i11 = (charAt == '\r' && (i9 = i12 + 1) < str.length() && str.charAt(i9) == '\n') ? 1 : 1;
                length = i12;
                this.f6041b = 1;
                this.f6043e = i11;
                this.d = length;
                return true;
            }
        }
        i11 = -1;
        this.f6041b = 1;
        this.f6043e = i11;
        this.d = length;
        return true;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f6041b = 0;
            int i9 = this.d;
            int i10 = this.f6042c;
            this.f6042c = this.f6043e + i9;
            return this.f6040a.subSequence(i10, i9).toString();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
