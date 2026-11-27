package defpackage;

import java.util.ListIterator;
public final class ukd extends v9c implements ListIterator {
    public final int b;
    public int c;
    public final omd d;

    public ukd(omd omdVar, int i) {
        super((byte) 10);
        int size = omdVar.size();
        if (i >= 0 && i <= size) {
            this.b = size;
            this.c = i;
            this.d = omdVar;
            return;
        }
        su3.g(c5f.c(i, size, "index"));
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
        lq5.n();
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
        lq5.n();
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
