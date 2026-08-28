package f7;

import java.util.Iterator;
public final class b extends m9 {
    public final transient d f5605c;
    public final transient c d;

    public b(d dVar, c cVar) {
        this.f5605c = dVar;
        this.d = cVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f5605c.get(obj) != null) {
            return true;
        }
        return false;
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
        this.f5605c.getClass();
        return 1;
    }
}
