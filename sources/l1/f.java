package l1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class f extends hd.j implements od.p {
    public Iterator f17527a;
    public n1.d f17528b;
    public Object f17529c;
    public int d;
    public Object f17530e;
    public final List f17531f;
    public final ArrayList h;

    public f(List list, ArrayList arrayList, fd.c cVar) {
        super(2, cVar);
        this.f17531f = list;
        this.h = arrayList;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        f fVar = new f(this.f17531f, this.h, cVar);
        fVar.f17530e = obj;
        return fVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create(obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        throw new UnsupportedOperationException("Method not decompiled: l1.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
