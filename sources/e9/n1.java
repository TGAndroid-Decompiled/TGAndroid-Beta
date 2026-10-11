package e9;

import java.util.Iterator;
public abstract class n1 implements Iterator {
    public final Iterator f8777a;

    public n1(Iterator it) {
        it.getClass();
        this.f8777a = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f8777a.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f8777a.next());
    }

    @Override
    public final void remove() {
        this.f8777a.remove();
    }
}
