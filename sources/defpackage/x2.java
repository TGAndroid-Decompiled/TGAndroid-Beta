package defpackage;

import java.util.ListIterator;
public final class x2 extends w2 implements ListIterator {
    public final z2 d;

    public x2(z2 z2Var, int i) {
        super(z2Var);
        this.d = z2Var;
        int h = z2Var.h();
        if (i >= 0 && i <= h) {
            this.b = i;
        } else {
            su3.g(c00.h(i, h, "index: ", ", size: "));
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
        lq5.n();
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
