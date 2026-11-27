package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
public abstract class y5f {
    public static boolean a(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = tpd.b;
            }
        } else if (collection instanceof mod) {
            obj = ((mod) collection).s;
        } else {
            return false;
        }
        return comparator.equals(obj);
    }
}
