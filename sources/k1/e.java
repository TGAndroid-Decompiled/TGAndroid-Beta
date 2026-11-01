package k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class e extends ed.j implements ld.p {
    public Iterator f10529a;
    public Object f10530b;
    public int f10531c;
    public Object d;
    public final List e;
    public final ArrayList f10532f;

    public e(List list, ArrayList arrayList, cd.c cVar) {
        super(2, cVar);
        this.e = list;
        this.f10532f = arrayList;
    }

    @Override
    public final cd.c create(Object obj, cd.c cVar) {
        e eVar = new e(this.e, this.f10532f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        dd.a aVar = dd.a.f5864a;
        int i10 = this.f10531c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f10529a;
                    list = (List) this.d;
                    l9.b.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f10530b;
                Iterator it2 = this.f10529a;
                List list2 = (List) this.d;
                l9.b.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new ed.j(1, null));
                    this.d = list2;
                    this.f10529a = it2;
                    this.f10530b = null;
                    this.f10531c = 2;
                    throw null;
                }
            }
        } else {
            l9.b.b(obj);
            obj = this.d;
            it = this.e.iterator();
            list = this.f10532f;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.d = list;
            this.f10529a = it;
            this.f10530b = obj;
            this.f10531c = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
