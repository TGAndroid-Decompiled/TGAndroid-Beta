package k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v7.t7;
public final class e extends kd.j implements rd.p {
    public Iterator f13160a;
    public Object f13161b;
    public int f13162c;
    public Object d;
    public final List e;
    public final ArrayList f13163f;

    public e(List list, ArrayList arrayList, id.c cVar) {
        super(2, cVar);
        this.e = list;
        this.f13163f = arrayList;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        e eVar = new e(this.e, this.f13163f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (id.c) obj2)).invokeSuspend(gd.i.f9616a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        jd.a aVar = jd.a.f12967a;
        int i10 = this.f13162c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f13160a;
                    list = (List) this.d;
                    t7.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f13161b;
                Iterator it2 = this.f13160a;
                List list2 = (List) this.d;
                t7.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new kd.j(1, null));
                    this.d = list2;
                    this.f13160a = it2;
                    this.f13161b = null;
                    this.f13162c = 2;
                    throw null;
                }
            }
        } else {
            t7.b(obj);
            obj = this.d;
            it = this.e.iterator();
            list = this.f13163f;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.d = list;
            this.f13160a = it;
            this.f13161b = obj;
            this.f13162c = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
