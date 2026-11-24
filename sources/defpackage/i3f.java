package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
public abstract class i3f {
    public static boolean a(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = end.b;
            }
        } else if (collection instanceof xld) {
            obj = ((xld) collection).s;
        } else {
            return false;
        }
        return comparator.equals(obj);
    }
}
