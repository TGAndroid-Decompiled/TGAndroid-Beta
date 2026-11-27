package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class qve {
    public static final awe a = new Object();
    public static final owe b = new Object();

    public abstract void a(ese eseVar, ese eseVar2, long j);

    public void b(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) a5f.l(obj, j);
        if (list instanceof vve) {
            unmodifiableList = ((vve) list).zze();
        } else if (!awe.c.isAssignableFrom(list.getClass())) {
            if ((list instanceof p0f) && (list instanceof bue)) {
                bue bueVar = (bue) list;
                if (bueVar.zza()) {
                    bueVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        } else {
            return;
        }
        a5f.d(j, obj, unmodifiableList);
    }
}
