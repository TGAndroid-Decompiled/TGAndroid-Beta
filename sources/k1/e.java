package k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v7.i8;
public final class e extends md.i implements td.p {
    public Iterator f13772a;
    public Object f13773b;
    public int f13774c;
    public Object d;
    public final List e;
    public final ArrayList f13775f;

    public e(List list, ArrayList arrayList, kd.c cVar) {
        super(2, cVar);
        this.e = list;
        this.f13775f = arrayList;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        e eVar = new e(this.e, this.f13775f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (kd.c) obj2)).invokeSuspend(id.i.f11390a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        ld.a aVar = ld.a.f14658a;
        int i10 = this.f13774c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f13772a;
                    list = (List) this.d;
                    i8.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f13773b;
                Iterator it2 = this.f13772a;
                List list2 = (List) this.d;
                i8.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new md.i(1, null));
                    this.d = list2;
                    this.f13772a = it2;
                    this.f13773b = null;
                    this.f13774c = 2;
                    throw null;
                }
            }
        } else {
            i8.b(obj);
            obj = this.d;
            it = this.e.iterator();
            list = this.f13775f;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.d = list;
            this.f13772a = it;
            this.f13773b = obj;
            this.f13774c = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
