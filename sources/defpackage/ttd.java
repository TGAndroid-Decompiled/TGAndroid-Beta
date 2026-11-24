package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public abstract class ttd {
    public static List a(List list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
