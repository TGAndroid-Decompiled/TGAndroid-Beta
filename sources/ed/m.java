package ed;

import java.util.AbstractCollection;
import java.util.Collection;
public abstract class m extends l {
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
