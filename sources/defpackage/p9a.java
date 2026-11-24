package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class p9a extends AbstractSet {
    public final byte a;

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                if (collection instanceof wo5) {
                    e89 e89Var = (e89) ((wo5) collection);
                    vo5 vo5Var = e89Var.h;
                    if (vo5Var == null) {
                        vo5Var = new vo5(e89Var, (byte) 1);
                        e89Var.h = vo5Var;
                    }
                    collection = vo5Var;
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
                return p2f.a(this, collection);
            default:
                return v2f.a(this, collection);
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
