package a8;

import java.util.Iterator;
public final class d0 extends w {
    public final transient f0 f360c;
    public final transient e0 d;

    public d0(f0 f0Var, e0 e0Var) {
        this.f360c = f0Var;
        this.d = e0Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f360c.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(Object[] objArr) {
        return this.d.f(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final int size() {
        this.f360c.getClass();
        return 1;
    }
}
