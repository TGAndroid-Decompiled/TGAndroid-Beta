package l7;

import java.util.Iterator;
public final class z extends t {
    public final transient b0 f11707c;
    public final transient a0 d;

    public z(b0 b0Var, a0 a0Var) {
        this.f11707c = b0Var;
        this.d = a0Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f11707c.get(obj) != null) {
            return true;
        }
        return false;
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
        this.f11707c.getClass();
        return 1;
    }
}
