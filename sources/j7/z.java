package j7;

import java.util.Iterator;
public final class z extends t {
    public final transient b0 f11269c;
    public final transient a0 d;

    public z(b0 b0Var, a0 a0Var) {
        this.f11269c = b0Var;
        this.d = a0Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f11269c.get(obj) != null) {
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
        this.f11269c.getClass();
        return 1;
    }
}
