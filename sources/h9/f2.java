package h9;

import java.util.Iterator;
public abstract class f2 implements Iterator {
    public final Iterator f13988a;

    public f2(Iterator it) {
        it.getClass();
        this.f13988a = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f13988a.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f13988a.next());
    }

    @Override
    public final void remove() {
        this.f13988a.remove();
    }
}
