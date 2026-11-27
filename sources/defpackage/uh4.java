package defpackage;

import java.io.Serializable;
import java.util.Comparator;
public final class uh4 implements Comparator, Serializable {
    @Override
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((th4) obj).c, ((th4) obj2).c);
    }
}
