package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class zhf {
    public static final vhf a = new Object();
    public static final xhf b = new Object();

    public void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) hjf.g(obj, j);
        if (list instanceof thf) {
            unmodifiableList = ((thf) list).zzd();
        } else if (!vhf.c.isAssignableFrom(list.getClass())) {
            if ((list instanceof qif) && (list instanceof ehf)) {
                mff mffVar = (mff) ((ehf) list);
                boolean z = mffVar.a;
                if (z && z) {
                    mffVar.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        } else {
            return;
        }
        hjf.i(obj, j, unmodifiableList);
    }

    public abstract void b(Object obj, long j, Object obj2);
}
