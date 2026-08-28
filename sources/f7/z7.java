package f7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class z7 {
    public static boolean a(h7.d0 d0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof h7.v) {
            collection = ((h7.v) collection).zza();
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
