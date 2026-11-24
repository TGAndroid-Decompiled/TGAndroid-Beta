package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
public abstract class el2 extends dl2 {
    public static void d(Iterable iterable, AbstractCollection abstractCollection) {
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }
}
