package f9;

import java.util.Iterator;
public abstract class f2 implements Iterator {
    public final Iterator f10280a;

    public f2(Iterator it) {
        it.getClass();
        this.f10280a = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f10280a.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f10280a.next());
    }

    @Override
    public final void remove() {
        this.f10280a.remove();
    }
}
