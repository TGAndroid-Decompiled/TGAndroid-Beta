package defpackage;

import java.util.ListIterator;
public final class w2 extends v2 implements ListIterator {
    public final y2 d;

    public w2(y2 y2Var, int i) {
        super(y2Var);
        this.d = y2Var;
        int h = y2Var.h();
        if (i >= 0 && i <= h) {
            this.b = i;
        } else {
            wa3.i(b10.g(i, h, "index: ", ", size: "));
            throw null;
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasPrevious() {
        if (this.b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int nextIndex() {
        return this.b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.b - 1;
            this.b = i;
            return this.d.get(i);
        }
        u36.g();
        return null;
    }

    @Override
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
