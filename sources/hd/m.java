package hd;

import java.util.ArrayList;
import java.util.Collection;
public abstract class m extends l {
    public static void e(ArrayList arrayList, Iterable elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements instanceof Collection) {
            arrayList.addAll((Collection) elements);
            return;
        }
        for (Object obj : elements) {
            arrayList.add(obj);
        }
    }
}
