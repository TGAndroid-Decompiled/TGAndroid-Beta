package k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v7.t7;
public final class e extends kd.j implements rd.p {
    public Iterator f13152a;
    public Object f13153b;
    public int f13154c;
    public Object d;
    public final List e;
    public final ArrayList f13155f;

    public e(List list, ArrayList arrayList, id.c cVar) {
        super(2, cVar);
        this.e = list;
        this.f13155f = arrayList;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        e eVar = new e(this.e, this.f13155f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (id.c) obj2)).invokeSuspend(gd.i.f9603a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        jd.a aVar = jd.a.f12959a;
        int i10 = this.f13154c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f13152a;
                    list = (List) this.d;
                    t7.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f13153b;
                Iterator it2 = this.f13152a;
                List list2 = (List) this.d;
                t7.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new kd.j(1, null));
                    this.d = list2;
                    this.f13152a = it2;
                    this.f13153b = null;
                    this.f13154c = 2;
                    throw null;
                }
            }
        } else {
            t7.b(obj);
            obj = this.d;
            it = this.e.iterator();
            list = this.f13155f;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.d = list;
            this.f13152a = it;
            this.f13153b = obj;
            this.f13154c = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
