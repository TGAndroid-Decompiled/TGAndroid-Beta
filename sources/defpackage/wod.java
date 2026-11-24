package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class wod {
    public static final ypd a = new Object();
    public static final zpd b = new Object();

    public void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) x1e.l(obj, j);
        if (list instanceof rod) {
            unmodifiableList = ((rod) list).g();
        } else if (ypd.c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        x1e.d(obj, j, unmodifiableList);
    }

    public abstract void b(xkd xkdVar, xkd xkdVar2, long j);
}
