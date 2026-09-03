package k7;

import java.util.Iterator;
public final class wa extends sa {
    public final transient ya f10002c;
    public final transient xa d;

    public wa(ya yaVar, xa xaVar) {
        this.f10002c = yaVar;
        this.d = xaVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f10002c.get(obj) != null) {
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
        this.f10002c.getClass();
        return 1;
    }
}
