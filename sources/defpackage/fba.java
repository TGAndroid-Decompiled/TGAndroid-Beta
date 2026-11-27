package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class fba extends AbstractSet {
    public final byte a;

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                if (collection instanceof zo5) {
                    p99 p99Var = (p99) ((zo5) collection);
                    yo5 yo5Var = p99Var.h;
                    if (yo5Var == null) {
                        yo5Var = new yo5(p99Var, (byte) 1);
                        p99Var.h = yo5Var;
                    }
                    collection = yo5Var;
                }
                boolean z = false;
                if ((collection instanceof Set) && collection.size() > size()) {
                    Iterator<E> it = iterator();
                    while (it.hasNext()) {
                        if (collection.contains(it.next())) {
                            it.remove();
                            z = true;
                        }
                    }
                } else {
                    for (Object obj : collection) {
                        z |= remove(obj);
                    }
                }
                return z;
            case 1:
                return g5f.a(this, collection);
            default:
                return l5f.a(this, collection);
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.a) {
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
