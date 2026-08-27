package g7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class c8 {
    public static boolean a(i7.d0 d0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof i7.v) {
            collection = ((i7.v) collection).zza();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= d0Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= d0Var.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = d0Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }
}
