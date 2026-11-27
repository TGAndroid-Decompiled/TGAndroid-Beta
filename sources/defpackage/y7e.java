package defpackage;

import java.util.ListIterator;
public final class y7e extends v9c implements ListIterator {
    public final int b;
    public int c;
    public final k8e d;

    public y7e(k8e k8eVar, int i) {
        super((byte) 12);
        int size = k8eVar.size();
        h6f.b(i, size);
        this.b = size;
        this.c = i;
        this.d = k8eVar;
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
