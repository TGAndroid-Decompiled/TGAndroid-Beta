package h9;

import java.util.Iterator;
public abstract class g2 implements Iterator {
    public final Iterator f14325a;

    public g2(Iterator it) {
        it.getClass();
        this.f14325a = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f14325a.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f14325a.next());
    }

    @Override
    public final void remove() {
        this.f14325a.remove();
    }
}
