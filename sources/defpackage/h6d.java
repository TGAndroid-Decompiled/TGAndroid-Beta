package defpackage;

import java.util.ListIterator;
public final class h6d extends v5c implements ListIterator {
    public final int b;
    public int c;
    public final a7d d;

    public h6d(a7d a7dVar, int i) {
        super((byte) 5);
        int size = a7dVar.size();
        if (i >= 0 && i <= size) {
            this.b = size;
            this.c = i;
            this.d = a7dVar;
            return;
        }
        k93.i(u3f.c(i, size, "index"));
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
