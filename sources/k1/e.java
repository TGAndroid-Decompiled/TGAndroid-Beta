package k1;

import a8.jd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class e extends nd.i implements ud.p {
    public Iterator f16049a;
    public Object f16050b;
    public int f16051c;
    public Object d;
    public final List e;
    public final ArrayList f16052f;

    public e(List list, ArrayList arrayList, ld.c cVar) {
        super(2, cVar);
        this.e = list;
        this.f16052f = arrayList;
    }

    @Override
    public final ld.c create(Object obj, ld.c cVar) {
        e eVar = new e(this.e, this.f16052f, cVar);
        eVar.d = obj;
        return eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (ld.c) obj2)).invokeSuspend(jd.i.f15579a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        md.a aVar = md.a.f18411a;
        int i10 = this.f16051c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f16049a;
                    list = (List) this.d;
                    jd.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f16050b;
                Iterator it2 = this.f16049a;
                List list2 = (List) this.d;
                jd.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new nd.i(1, null));
                    this.d = list2;
                    this.f16049a = it2;
                    this.f16050b = null;
                    this.f16051c = 2;
                    throw null;
                }
            }
        } else {
            jd.b(obj);
            obj = this.d;
            it = this.e.iterator();
            list = this.f16052f;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.d = list;
            this.f16049a = it;
            this.f16050b = obj;
            this.f16051c = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
