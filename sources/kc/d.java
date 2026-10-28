package kc;

import java.io.Serializable;
import java.util.Comparator;
public final class d implements Comparator, Serializable {
    @Override
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((c) obj).f16511c, ((c) obj2).f16511c);
    }
}
