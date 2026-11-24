package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
public abstract class lne {
    public static Object a(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return str;
    }

    public static Object b(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return aq1.m(1, list);
            }
            u36.g();
            return null;
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static void c(List list, di8 di8Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (di8Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }
}
