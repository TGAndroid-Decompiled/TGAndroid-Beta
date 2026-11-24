package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class yff {
    public static final uff a = new Object();
    public static final wff b = new Object();

    public void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) ghf.g(obj, j);
        if (list instanceof sff) {
            unmodifiableList = ((sff) list).zzd();
        } else if (!uff.c.isAssignableFrom(list.getClass())) {
            if ((list instanceof pgf) && (list instanceof dff)) {
                ldf ldfVar = (ldf) ((dff) list);
                boolean z = ldfVar.a;
                if (z && z) {
                    ldfVar.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        } else {
            return;
        }
        ghf.i(obj, j, unmodifiableList);
    }

    public abstract void b(Object obj, long j, Object obj2);
}
