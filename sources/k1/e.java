package k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v7.a8;
public final class e extends ld.j implements sd.p {
    public Iterator f14333a;
    public Object f14334b;
    public int f14335c;
    public Object d;
    public final List f14336e;
    public final ArrayList f14337f;

    public e(List list, ArrayList arrayList, jd.c cVar) {
        super(2, cVar);
        this.f14336e = list;
        this.f14337f = arrayList;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        e eVar = new e(this.f14336e, this.f14337f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (jd.c) obj2)).invokeSuspend(hd.i.f11090a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        kd.a aVar = kd.a.f14781a;
        int i10 = this.f14335c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f14333a;
                    list = (List) this.d;
                    a8.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f14334b;
                Iterator it2 = this.f14333a;
                List list2 = (List) this.d;
                a8.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new ld.j(1, null));
                    this.d = list2;
                    this.f14333a = it2;
                    this.f14334b = null;
                    this.f14335c = 2;
                    throw null;
                }
            }
        } else {
            a8.b(obj);
            obj = this.d;
            it = this.f14336e.iterator();
            list = this.f14337f;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.d = list;
            this.f14333a = it;
            this.f14334b = obj;
            this.f14335c = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
