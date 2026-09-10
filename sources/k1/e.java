package k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v7.u7;
public final class e extends kd.j implements rd.p {
    public Iterator f12007a;
    public Object f12008b;
    public int f12009c;
    public Object d;
    public final List e;
    public final ArrayList f12010f;

    public e(List list, ArrayList arrayList, id.c cVar) {
        super(2, cVar);
        this.e = list;
        this.f12010f = arrayList;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        e eVar = new e(this.e, this.f12010f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (id.c) obj2)).invokeSuspend(gd.i.f8748a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        jd.a aVar = jd.a.f11861a;
        int i10 = this.f12009c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f12007a;
                    list = (List) this.d;
                    u7.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f12008b;
                Iterator it2 = this.f12007a;
                List list2 = (List) this.d;
                u7.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new kd.j(1, null));
                    this.d = list2;
                    this.f12007a = it2;
                    this.f12008b = null;
                    this.f12009c = 2;
                    throw null;
                }
            }
        } else {
            u7.b(obj);
            obj = this.d;
            it = this.e.iterator();
            list = this.f12010f;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.d = list;
            this.f12007a = it;
            this.f12008b = obj;
            this.f12009c = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
