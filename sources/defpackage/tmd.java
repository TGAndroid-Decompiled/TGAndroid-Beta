package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class tmd {
    public static final vnd a = new Object();
    public static final wnd b = new Object();

    public void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) uzd.l(obj, j);
        if (list instanceof omd) {
            unmodifiableList = ((omd) list).g();
        } else if (vnd.c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        uzd.d(obj, j, unmodifiableList);
    }

    public abstract void b(vid vidVar, vid vidVar2, long j);
}
