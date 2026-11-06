package a8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class v0 {
    public static boolean a(h0 h0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof z) {
            collection = ((z) collection).zza();
        }
        boolean z9 = false;
        if ((collection instanceof Set) && collection.size() > h0Var.size()) {
            Iterator<E> it = h0Var.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z9 = true;
                }
            }
            return z9;
        }
        for (Object obj : collection) {
            z9 |= h0Var.remove(obj);
        }
        return z9;
    }
}
