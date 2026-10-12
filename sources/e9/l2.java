package e9;

import java.util.Iterator;
public abstract class l2 implements Iterator {
    public final Iterator f8584a;

    public l2(Iterator it) {
        it.getClass();
        this.f8584a = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f8584a.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f8584a.next());
    }

    @Override
    public final void remove() {
        this.f8584a.remove();
    }
}
