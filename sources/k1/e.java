package k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v7.a8;
public final class e extends ld.j implements sd.p {
    public Iterator f14336a;
    public Object f14337b;
    public int f14338c;
    public Object d;
    public final List f14339e;
    public final ArrayList f14340f;

    public e(List list, ArrayList arrayList, jd.c cVar) {
        super(2, cVar);
        this.f14339e = list;
        this.f14340f = arrayList;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        e eVar = new e(this.f14339e, this.f14340f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (jd.c) obj2)).invokeSuspend(hd.i.f11092a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        kd.a aVar = kd.a.f14784a;
        int i10 = this.f14338c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f14336a;
                    list = (List) this.d;
                    a8.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f14337b;
                Iterator it2 = this.f14336a;
                List list2 = (List) this.d;
                a8.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new ld.j(1, null));
                    this.d = list2;
                    this.f14336a = it2;
                    this.f14337b = null;
                    this.f14338c = 2;
                    throw null;
                }
            }
        } else {
            a8.b(obj);
            obj = this.d;
            it = this.f14339e.iterator();
            list = this.f14340f;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.d = list;
            this.f14336a = it;
            this.f14337b = obj;
            this.f14338c = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
