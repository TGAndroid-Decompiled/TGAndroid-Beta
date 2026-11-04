package g9;

import java.util.Iterator;
public abstract class f2 implements Iterator {
    public final Iterator f12076a;

    public f2(Iterator it) {
        it.getClass();
        this.f12076a = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f12076a.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f12076a.next());
    }

    @Override
    public final void remove() {
        this.f12076a.remove();
    }
}
