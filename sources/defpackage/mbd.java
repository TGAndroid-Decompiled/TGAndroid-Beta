package defpackage;

import java.util.ListIterator;
public final class mbd extends v7c implements ListIterator {
    public final int b;
    public int c;
    public final ccd d;

    public mbd(ccd ccdVar, int i) {
        super((byte) 7);
        int size = ccdVar.size();
        if (i >= 0 && i <= size) {
            this.b = size;
            this.c = i;
            this.d = ccdVar;
            return;
        }
        wa3.i(n4f.c(i, size, "index"));
        throw null;
    }

    public final Object a(int i) {
        return this.d.get(i);
    }

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
        u36.g();
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
        u36.g();
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
