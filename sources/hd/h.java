package hd;

import java.util.Collection;
public abstract class h extends g {
    public static int d(Iterable iterable, int i7) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i7;
    }
}
