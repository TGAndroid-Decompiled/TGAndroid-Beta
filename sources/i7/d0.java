package i7;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class d0 extends AbstractSet {

    public final int f10609a;

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.f10609a) {
            case 0:
                return g7.c8.a(this, collection);
            case 1:
                return g7.w8.a(this, collection);
            default:
                collection.getClass();
                if (collection instanceof p8.i0) {
                    collection = ((p8.i0) collection).b();
                }
                boolean zRemove = false;
                if (!(collection instanceof Set) || collection.size() <= size()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        zRemove |= remove(it.next());
                    }
                } else {
                    Iterator<E> it2 = iterator();
                    while (it2.hasNext()) {
                        if (collection.contains(it2.next())) {
                            it2.remove();
                            zRemove = true;
                        }
                    }
                }
                return zRemove;
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f10609a) {
            case 0:
                collection.getClass();
                break;
            case 1:
                collection.getClass();
                break;
            default:
                collection.getClass();
                break;
        }
        return super.retainAll(collection);
    }
}
