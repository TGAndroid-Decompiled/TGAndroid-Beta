package i7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class p {
    public static boolean a(j7.d0 d0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof l7.l) {
            collection = ((l7.l) collection).zza();
        }
        boolean z10 = false;
        if ((collection instanceof Set) && collection.size() > d0Var.size()) {
            Iterator<E> it = d0Var.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        for (Object obj : collection) {
            z10 |= d0Var.remove(obj);
        }
        return z10;
    }
}
