package defpackage;

import java.util.Iterator;
public final class a56 implements Iterator {
    public final CharSequence a;
    public byte b;
    public int c;
    public int d;
    public int e;

    public a56(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override
    public final boolean hasNext() {
        int i;
        byte b = this.b;
        if (b != 0) {
            if (b != 1) {
                return false;
            }
            return true;
        }
        int i2 = 2;
        if (this.e < 0) {
            this.b = (byte) 2;
            return false;
        }
        CharSequence charSequence = this.a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i3 = this.c; i3 < length2; i3++) {
            char charAt = charSequence.charAt(i3);
            if (charAt == '\n' || charAt == '\r') {
                i2 = (charAt == '\r' && (i = i3 + 1) < charSequence.length() && charSequence.charAt(i) == '\n') ? 1 : 1;
                length = i3;
                this.b = (byte) 1;
                this.e = i2;
                this.d = length;
                return true;
            }
        }
        i2 = -1;
        this.b = (byte) 1;
        this.e = i2;
        this.d = length;
        return true;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.b = (byte) 0;
            int i = this.d;
            int i2 = this.c;
            this.c = this.e + i;
            return this.a.subSequence(i2, i).toString();
        }
        lq5.n();
        return null;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
