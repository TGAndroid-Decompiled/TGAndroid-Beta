package e9;

import java.util.Iterator;
public abstract class l2 implements Iterator {
    public final Iterator f8468a;

    public l2(Iterator it) {
        it.getClass();
        this.f8468a = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f8468a.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f8468a.next());
    }

    @Override
    public final void remove() {
        this.f8468a.remove();
    }
}
