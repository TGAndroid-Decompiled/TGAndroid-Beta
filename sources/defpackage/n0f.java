package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class n0f {
    public static boolean a(o7a o7aVar, Collection collection) {
        collection.getClass();
        if (collection instanceof mdd) {
            collection = ((mdd) collection).zza();
        }
        boolean z = false;
        if ((collection instanceof Set) && collection.size() > o7aVar.size()) {
            Iterator<E> it = o7aVar.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        for (Object obj : collection) {
            z |= o7aVar.remove(obj);
        }
        return z;
    }
}
