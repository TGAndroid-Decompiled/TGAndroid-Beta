package m1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class f extends kd.j implements rd.p {
    public Iterator f19368a;
    public o1.d f19369b;
    public Object f19370c;
    public int d;
    public Object f19371e;
    public final List f19372f;
    public final ArrayList h;

    public f(List list, ArrayList arrayList, id.c cVar) {
        super(2, cVar);
        this.f19372f = list;
        this.h = arrayList;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        f fVar = new f(this.f19372f, this.h, cVar);
        fVar.f19371e = obj;
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
