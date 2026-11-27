package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class g5f {
    public static boolean a(fba fbaVar, Collection collection) {
        collection.getClass();
        if (collection instanceof eid) {
            collection = ((eid) collection).zza();
        }
        boolean z = false;
        if ((collection instanceof Set) && collection.size() > fbaVar.size()) {
            Iterator<E> it = fbaVar.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        for (Object obj : collection) {
            z |= fbaVar.remove(obj);
        }
        return z;
    }
}
