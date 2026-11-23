package m1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class f extends kd.j implements rd.p {
    public Iterator f20357a;
    public o1.d f20358b;
    public Object f20359c;
    public int d;
    public Object f20360e;
    public final List f20361f;
    public final ArrayList h;

    public f(List list, ArrayList arrayList, id.c cVar) {
        super(2, cVar);
        this.f20361f = list;
        this.h = arrayList;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        f fVar = new f(this.f20361f, this.h, cVar);
        fVar.f20360e = obj;
        return fVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create(obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        throw new UnsupportedOperationException("Method not decompiled: m1.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
