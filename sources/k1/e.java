package k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v7.t7;
public final class e extends kd.j implements rd.p {
    public Iterator f14469a;
    public Object f14470b;
    public int f14471c;
    public Object d;
    public final List f14472e;
    public final ArrayList f14473f;

    public e(List list, ArrayList arrayList, id.c cVar) {
        super(2, cVar);
        this.f14472e = list;
        this.f14473f = arrayList;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        e eVar = new e(this.f14472e, this.f14473f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (id.c) obj2)).invokeSuspend(gd.i.f10616a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        jd.a aVar = jd.a.f13640a;
        int i10 = this.f14471c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f14469a;
                    list = (List) this.d;
                    t7.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f14470b;
                Iterator it2 = this.f14469a;
                List list2 = (List) this.d;
                t7.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new kd.j(1, null));
                    this.d = list2;
                    this.f14469a = it2;
                    this.f14470b = null;
                    this.f14471c = 2;
                    throw null;
                }
            }
        } else {
            t7.b(obj);
            obj = this.d;
            it = this.f14472e.iterator();
            list = this.f14473f;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.d = list;
            this.f14469a = it;
            this.f14470b = obj;
            this.f14471c = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
