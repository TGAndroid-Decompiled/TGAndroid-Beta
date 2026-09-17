package e9;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import w7.h9;
import w7.k8;
public abstract class l1 extends AbstractSet {
    public final int f8974a;

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.f8974a) {
            case 0:
                collection.getClass();
                if (collection instanceof w0) {
                    collection = ((w0) collection).b();
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
            case 1:
                return k8.a(this, collection);
            default:
                return h9.a(this, collection);
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f8974a) {
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
