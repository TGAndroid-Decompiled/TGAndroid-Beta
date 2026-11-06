package hd;

import java.util.AbstractCollection;
import java.util.Collection;
public abstract class l extends k {
    public static void e(Iterable elements, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.j.e(elements, "elements");
        if (elements instanceof Collection) {
            abstractCollection.addAll((Collection) elements);
            return;
        }
        for (Object obj : elements) {
            abstractCollection.add(obj);
        }
    }
}
