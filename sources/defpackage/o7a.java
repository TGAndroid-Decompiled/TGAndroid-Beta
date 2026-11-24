package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class o7a extends AbstractSet {
    public final byte a;

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                if (collection instanceof wm5) {
                    c69 c69Var = (c69) ((wm5) collection);
                    vm5 vm5Var = c69Var.h;
                    if (vm5Var == null) {
                        vm5Var = new vm5(c69Var, (byte) 1);
                        c69Var.h = vm5Var;
                    }
                    collection = vm5Var;
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
                return n0f.a(this, collection);
            default:
                return t0f.a(this, collection);
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
