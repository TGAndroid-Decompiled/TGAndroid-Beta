package ed;

import java.util.Collection;
public abstract class i extends h {
    public static int d(Iterable iterable, int i3) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i3;
    }
}
