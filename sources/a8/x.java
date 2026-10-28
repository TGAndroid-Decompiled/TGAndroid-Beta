package a8;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class x extends AbstractSet {
    public final int f978a;

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.f978a) {
            case 0:
                return m0.a(this, collection);
            case 1:
                collection.getClass();
                if (collection instanceof f9.m1) {
                    collection = ((f9.y1) ((f9.m1) collection)).s();
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
                return w7.g5.a(this, collection);
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f978a) {
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
