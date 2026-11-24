package defpackage;

import java.util.Iterator;
public final class fl1 implements Iterator {
    public final int a;
    public boolean b;
    public int c;

    public fl1(char c, char c2) {
        boolean z;
        this.a = c2;
        if (rr5.b(c, c2) <= 0) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        this.c = z ? c : c2;
    }

    @Override
    public final boolean hasNext() {
        return this.b;
    }

    @Override
    public final Object next() {
        int i = this.c;
        if (i == this.a) {
            if (this.b) {
                this.b = false;
            } else {
                u36.g();
                return null;
            }
        } else {
            this.c = i + 1;
        }
        return Character.valueOf((char) i);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
