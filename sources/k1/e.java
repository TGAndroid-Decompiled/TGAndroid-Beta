package k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v7.t7;
public final class e extends kd.j implements rd.p {
    public Iterator f14300a;
    public Object f14301b;
    public int f14302c;
    public Object d;
    public final List f14303e;
    public final ArrayList f14304f;

    public e(List list, ArrayList arrayList, id.c cVar) {
        super(2, cVar);
        this.f14303e = list;
        this.f14304f = arrayList;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        e eVar = new e(this.f14303e, this.f14304f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (id.c) obj2)).invokeSuspend(gd.i.f10453a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        jd.a aVar = jd.a.f14088a;
        int i10 = this.f14302c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f14300a;
                    list = (List) this.d;
                    t7.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f14301b;
                Iterator it2 = this.f14300a;
                List list2 = (List) this.d;
                t7.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new kd.j(1, null));
                    this.d = list2;
                    this.f14300a = it2;
                    this.f14301b = null;
                    this.f14302c = 2;
                    throw null;
                }
            }
        } else {
            t7.b(obj);
            obj = this.d;
            it = this.f14303e.iterator();
            list = this.f14304f;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.d = list;
            this.f14300a = it;
            this.f14301b = obj;
            this.f14302c = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
