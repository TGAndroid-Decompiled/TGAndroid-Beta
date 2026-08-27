package g7;

import java.util.Iterator;

public final class b extends l9 {

    public final transient d f6406c;
    public final transient c d;

    public b(d dVar, c cVar) {
        this.f6406c = dVar;
        this.d = cVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f6406c.get(obj) != null;
    }

    @Override
    public final int i(Object[] objArr) {
        return this.d.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final int size() {
        this.f6406c.getClass();
        return 1;
    }
}
