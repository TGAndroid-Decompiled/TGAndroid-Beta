package a8;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class h0 extends AbstractSet {
    public final int f461a;

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.f461a) {
            case 0:
                return v0.a(this, collection);
            case 1:
                return d8.a(this, collection);
            default:
                collection.getClass();
                if (collection instanceof h9.n1) {
                    collection = ((h9.z1) ((h9.n1) collection)).o();
                }
                boolean z9 = false;
                if ((collection instanceof Set) && collection.size() > size()) {
                    Iterator<E> it = iterator();
                    while (it.hasNext()) {
                        if (collection.contains(it.next())) {
                            it.remove();
                            z9 = true;
                        }
                    }
                } else {
                    for (Object obj : collection) {
                        z9 |= remove(obj);
                    }
                }
                return z9;
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f461a) {
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
