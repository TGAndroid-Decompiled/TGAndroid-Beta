package e9;

import java.util.Iterator;
public abstract class l2 implements Iterator {
    public final Iterator f8587a;

    public l2(Iterator it) {
        it.getClass();
        this.f8587a = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f8587a.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f8587a.next());
    }

    @Override
    public final void remove() {
        this.f8587a.remove();
    }
}
