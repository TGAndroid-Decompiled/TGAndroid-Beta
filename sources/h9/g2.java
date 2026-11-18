package h9;

import java.util.Iterator;
public abstract class g2 implements Iterator {
    public final Iterator f13999a;

    public g2(Iterator it) {
        it.getClass();
        this.f13999a = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f13999a.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f13999a.next());
    }

    @Override
    public final void remove() {
        this.f13999a.remove();
    }
}
