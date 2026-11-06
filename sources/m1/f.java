package m1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class f extends kd.j implements rd.p {
    public Iterator f19365a;
    public o1.d f19366b;
    public Object f19367c;
    public int d;
    public Object f19368e;
    public final List f19369f;
    public final ArrayList h;

    public f(List list, ArrayList arrayList, id.c cVar) {
        super(2, cVar);
        this.f19369f = list;
        this.h = arrayList;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        f fVar = new f(this.f19369f, this.h, cVar);
        fVar.f19368e = obj;
        return fVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create(obj, (id.c) obj2)).invokeSuspend(gd.k.f13829a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        throw new UnsupportedOperationException("Method not decompiled: m1.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
