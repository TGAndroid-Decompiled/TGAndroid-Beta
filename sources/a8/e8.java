package a8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class e8 {
    public static boolean a(h0 h0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof c8.l) {
            collection = ((c8.l) collection).zza();
        }
        boolean z10 = false;
        if ((collection instanceof Set) && collection.size() > h0Var.size()) {
            Iterator<E> it = h0Var.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        for (Object obj : collection) {
            z10 |= h0Var.remove(obj);
        }
        return z10;
    }
}
