package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class cte {
    public static final mte a = new Object();
    public static final aue b = new Object();

    public abstract void a(qpe qpeVar, qpe qpeVar2, long j);

    public void b(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) k2f.l(obj, j);
        if (list instanceof hte) {
            unmodifiableList = ((hte) list).zze();
        } else if (!mte.c.isAssignableFrom(list.getClass())) {
            if ((list instanceof aye) && (list instanceof nre)) {
                nre nreVar = (nre) list;
                if (nreVar.zza()) {
                    nreVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        } else {
            return;
        }
        k2f.d(obj, j, unmodifiableList);
    }
}
