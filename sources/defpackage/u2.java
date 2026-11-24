package defpackage;

import java.util.ListIterator;
public abstract class u2 extends v5c implements ListIterator {
    public final int b;
    public int c;

    public u2(int i, int i2) {
        super((byte) 0);
        gre.m(i2, i);
        this.b = i;
        this.c = i2;
    }

    public abstract Object a(int i);

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.c < this.b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i = this.c;
            this.c = i + 1;
            return a(i);
        }
        w26.g();
        return null;
    }

    @Override
    public final int nextIndex() {
        return this.c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.c - 1;
            this.c = i;
            return a(i);
        }
        w26.g();
        return null;
    }

    @Override
    public final int previousIndex() {
        return this.c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
