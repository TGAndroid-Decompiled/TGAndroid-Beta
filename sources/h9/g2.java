package h9;

import java.util.Iterator;
public abstract class g2 implements Iterator {
    public final Iterator f14327a;

    public g2(Iterator it) {
        it.getClass();
        this.f14327a = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f14327a.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f14327a.next());
    }

    @Override
    public final void remove() {
        this.f14327a.remove();
    }
}
