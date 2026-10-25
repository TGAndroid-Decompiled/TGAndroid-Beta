package f9;

import java.util.Iterator;
public abstract class f2 implements Iterator {
    public final Iterator f10281a;

    public f2(Iterator it) {
        it.getClass();
        this.f10281a = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f10281a.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f10281a.next());
    }

    @Override
    public final void remove() {
        this.f10281a.remove();
    }
}
