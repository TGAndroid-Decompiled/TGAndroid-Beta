package i7;

import java.util.Iterator;

public final class z extends t {

    public final transient b0 f10899c;
    public final transient a0 d;

    public z(b0 b0Var, a0 a0Var) {
        this.f10899c = b0Var;
        this.d = a0Var;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f10899c.get(obj) != null;
    }

    @Override
    public final int i(Object[] objArr) {
        return this.d.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final int size() {
        this.f10899c.getClass();
        return 1;
    }
}
