package e9;

import java.util.Iterator;
public abstract class n1 implements Iterator {
    public final Iterator f8983a;

    public n1(Iterator it) {
        it.getClass();
        this.f8983a = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f8983a.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f8983a.next());
    }

    @Override
    public final void remove() {
        this.f8983a.remove();
    }
}
