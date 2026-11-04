package b8;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class x extends AbstractSet {
    public final int f3111a;

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.f3111a) {
            case 0:
                return l1.a(this, collection);
            case 1:
                collection.getClass();
                if (collection instanceof g9.m1) {
                    collection = ((g9.y1) ((g9.m1) collection)).o();
                }
                boolean z10 = false;
                if ((collection instanceof Set) && collection.size() > size()) {
                    Iterator<E> it = iterator();
                    while (it.hasNext()) {
                        if (collection.contains(it.next())) {
                            it.remove();
                            z10 = true;
                        }
                    }
                } else {
                    for (Object obj : collection) {
                        z10 |= remove(obj);
                    }
                }
                return z10;
            default:
                return x7.v6.a(this, collection);
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f3111a) {
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
