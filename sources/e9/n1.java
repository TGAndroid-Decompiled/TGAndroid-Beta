package e9;

import java.util.Iterator;
public abstract class n1 implements Iterator {
    public final Iterator f9011a;

    public n1(Iterator it) {
        it.getClass();
        this.f9011a = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f9011a.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f9011a.next());
    }

    @Override
    public final void remove() {
        this.f9011a.remove();
    }
}
