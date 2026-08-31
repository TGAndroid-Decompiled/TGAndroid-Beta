package k7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class d0 {
    public static boolean a(l7.d0 d0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof n7.l) {
            collection = ((n7.l) collection).zza();
        }
        boolean z4 = false;
        if ((collection instanceof Set) && collection.size() > d0Var.size()) {
            Iterator<E> it = d0Var.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z4 = true;
                }
            }
            return z4;
        }
        for (Object obj : collection) {
            z4 |= d0Var.remove(obj);
        }
        return z4;
    }
}
