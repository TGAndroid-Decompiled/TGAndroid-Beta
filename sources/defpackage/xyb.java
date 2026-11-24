package defpackage;

import java.util.Iterator;
import java.util.Map;
public abstract class xyb implements Iterator {
    public final Iterator a;

    public xyb(Iterator it) {
        it.getClass();
        this.a = it;
    }

    public Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.a.next());
    }

    @Override
    public final void remove() {
        this.a.remove();
    }
}
