package l7;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class d0 extends AbstractSet {
    public final int f11550a;

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.f11550a) {
            case 0:
                return k7.h.a(this, collection);
            case 1:
                return k7.c0.a(this, collection);
            default:
                collection.getClass();
                if (collection instanceof s8.f0) {
                    collection = ((s8.f0) collection).c();
                }
                boolean z4 = false;
                if ((collection instanceof Set) && collection.size() > size()) {
                    Iterator<E> it = iterator();
                    while (it.hasNext()) {
                        if (collection.contains(it.next())) {
                            it.remove();
                            z4 = true;
                        }
                    }
                } else {
                    for (Object obj : collection) {
                        z4 |= remove(obj);
                    }
                }
                return z4;
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f11550a) {
            case 0:
                collection.getClass();
                return super.retainAll(collection);
            case 1:
                collection.getClass();
                return super.retainAll(collection);
            default:
                collection.getClass();
                return super.retainAll(collection);
        }
    }
}
