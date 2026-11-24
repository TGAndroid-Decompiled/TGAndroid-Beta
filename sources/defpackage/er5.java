package defpackage;

import java.util.Iterator;
public final class er5 implements Iterator {
    public final int a;
    public final int b;
    public boolean c;
    public int d;

    public er5(int i, int i2, int i3) {
        this.a = i3;
        this.b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.c = z;
        this.d = z ? i : i2;
    }

    @Override
    public final boolean hasNext() {
        return this.c;
    }

    @Override
    public final Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.d;
        if (i == this.b) {
            if (this.c) {
                this.c = false;
                return i;
            }
            u36.g();
            return 0;
        }
        this.d = this.a + i;
        return i;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
