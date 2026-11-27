package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class okf {
    public static final kkf a = new Object();
    public static final mkf b = new Object();

    public void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) wlf.g(obj, j);
        if (list instanceof ikf) {
            unmodifiableList = ((ikf) list).zzd();
        } else if (!kkf.c.isAssignableFrom(list.getClass())) {
            if ((list instanceof flf) && (list instanceof tjf)) {
                bif bifVar = (bif) ((tjf) list);
                boolean z = bifVar.a;
                if (z && z) {
                    bifVar.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        } else {
            return;
        }
        wlf.i(obj, j, unmodifiableList);
    }

    public abstract void b(long j, Object obj, Object obj2);
}
