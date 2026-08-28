package k1;

import g7.y5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class e extends sc.i implements zc.p {
    public Iterator f14443a;
    public Object f14444b;
    public int f14445c;
    public Object d;
    public final List f14446e;
    public final ArrayList f14447f;

    public e(List list, ArrayList arrayList, qc.c cVar) {
        super(2, cVar);
        this.f14446e = list;
        this.f14447f = arrayList;
    }

    @Override
    public final qc.c create(Object obj, qc.c cVar) {
        e eVar = new e(this.f14446e, this.f14447f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        rc.a aVar = rc.a.f47127a;
        int i9 = this.f14445c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    it = this.f14443a;
                    list = (List) this.d;
                    y5.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f14444b;
                Iterator it2 = this.f14443a;
                List list2 = (List) this.d;
                y5.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new sc.i(1, null));
                    this.d = list2;
                    this.f14443a = it2;
                    this.f14444b = null;
                    this.f14445c = 2;
                    throw null;
                }
            }
        } else {
            y5.b(obj);
            obj = this.d;
            it = this.f14446e.iterator();
            list = this.f14447f;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.d = list;
            this.f14443a = it;
            this.f14444b = obj;
            this.f14445c = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
