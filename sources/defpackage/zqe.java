package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class zqe {
    public static final jre a = new Object();
    public static final xre b = new Object();

    public abstract void a(nne nneVar, nne nneVar2, long j);

    public void b(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) i0f.l(obj, j);
        if (list instanceof ere) {
            unmodifiableList = ((ere) list).zze();
        } else if (!jre.c.isAssignableFrom(list.getClass())) {
            if ((list instanceof yve) && (list instanceof kpe)) {
                kpe kpeVar = (kpe) list;
                if (kpeVar.zza()) {
                    kpeVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        } else {
            return;
        }
        i0f.d(obj, j, unmodifiableList);
    }
}
