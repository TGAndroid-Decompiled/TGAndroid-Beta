package k1;

import i7.c7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class e extends uc.i implements bd.p {
    public Iterator f13261a;
    public Object f13262b;
    public int f13263c;
    public Object d;
    public final List f13264e;
    public final ArrayList f13265f;

    public e(List list, ArrayList arrayList, sc.c cVar) {
        super(2, cVar);
        this.f13264e = list;
        this.f13265f = arrayList;
    }

    @Override
    public final sc.c create(Object obj, sc.c cVar) {
        e eVar = new e(this.f13264e, this.f13265f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        tc.a aVar = tc.a.f48210a;
        int i10 = this.f13263c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f13261a;
                    list = (List) this.d;
                    c7.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f13262b;
                Iterator it2 = this.f13261a;
                List list2 = (List) this.d;
                c7.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new uc.i(1, null));
                    this.d = list2;
                    this.f13261a = it2;
                    this.f13262b = null;
                    this.f13263c = 2;
                    throw null;
                }
            }
        } else {
            c7.b(obj);
            obj = this.d;
            it = this.f13264e.iterator();
            list = this.f13265f;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.d = list;
            this.f13261a = it;
            this.f13262b = obj;
            this.f13263c = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
