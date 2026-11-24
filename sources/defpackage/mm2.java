package defpackage;

import java.util.Collection;
public abstract class mm2 extends lm2 {
    public static int c(Iterable iterable, int i) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }
}
