package k1;

import h7.k6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e extends tc.i implements ad.p {

    public Iterator f14264a;

    public Object f14265b;

    public int f14266c;
    public Object d;

    public final List f14267e;

    public final ArrayList f14268f;

    public e(List list, ArrayList arrayList, rc.c cVar) {
        super(2, cVar);
        this.f14267e = list;
        this.f14268f = arrayList;
    }

    @Override
    public final rc.c create(Object obj, rc.c cVar) {
        e eVar = new e(this.f14267e, this.f14268f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (rc.c) obj2)).invokeSuspend(pc.i.f45696a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        sc.a aVar = sc.a.f47847a;
        int i10 = this.f14266c;
        if (i10 == 0) {
            k6.b(obj);
            obj = this.d;
            it = this.f14267e.iterator();
            list = this.f14268f;
        } else if (i10 == 1) {
            Object obj2 = this.f14265b;
            Iterator it2 = this.f14264a;
            List list2 = (List) this.d;
            k6.b(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new d(1, null));
                this.d = list2;
                this.f14264a = it2;
                this.f14265b = null;
                this.f14266c = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f14264a;
            list = (List) this.d;
            k6.b(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.d = list;
        this.f14264a = it;
        this.f14265b = obj;
        this.f14266c = 1;
        throw null;
    }
}
