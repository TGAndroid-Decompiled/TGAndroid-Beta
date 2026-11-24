package defpackage;

import java.io.Serializable;
import java.util.Comparator;
public final class wf4 implements Comparator, Serializable {
    @Override
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((vf4) obj).c, ((vf4) obj2).c);
    }
}
