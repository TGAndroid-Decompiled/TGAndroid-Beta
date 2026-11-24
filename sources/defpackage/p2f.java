package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class p2f {
    public static boolean a(p9a p9aVar, Collection collection) {
        collection.getClass();
        if (collection instanceof ofd) {
            collection = ((ofd) collection).zza();
        }
        boolean z = false;
        if ((collection instanceof Set) && collection.size() > p9aVar.size()) {
            Iterator<E> it = p9aVar.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        for (Object obj : collection) {
            z |= p9aVar.remove(obj);
        }
        return z;
    }
}
