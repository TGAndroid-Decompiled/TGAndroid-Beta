package e9;

import java.util.Iterator;
public abstract class n1 implements Iterator {
    public final Iterator f7407a;

    public n1(Iterator it) {
        it.getClass();
        this.f7407a = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f7407a.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f7407a.next());
    }

    @Override
    public final void remove() {
        this.f7407a.remove();
    }
}
