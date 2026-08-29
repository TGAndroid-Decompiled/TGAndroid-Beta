package j7;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class d0 extends AbstractSet {
    public final int f10982a;

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.f10982a) {
            case 0:
                return h7.s8.a(this, collection);
            case 1:
                return i7.p.a(this, collection);
            default:
                collection.getClass();
                if (collection instanceof q8.i0) {
                    collection = ((q8.i0) collection).b();
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
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f10982a) {
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
