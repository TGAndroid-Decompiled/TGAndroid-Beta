package k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k7.q7;
public final class f extends wc.i implements dd.p {
    public Iterator f10279a;
    public Object f10280b;
    public int f10281c;
    public Object d;
    public final List f10282e;
    public final ArrayList f10283f;

    public f(List list, ArrayList arrayList, uc.c cVar) {
        super(2, cVar);
        this.f10282e = list;
        this.f10283f = arrayList;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        f fVar = new f(this.f10282e, this.f10283f, cVar);
        fVar.d = obj;
        return fVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create(obj, (uc.c) obj2)).invokeSuspend(sc.i.f47274a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        vc.a aVar = vc.a.f48998a;
        int i10 = this.f10281c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f10279a;
                    list = (List) this.d;
                    q7.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f10280b;
                Iterator it2 = this.f10279a;
                List list2 = (List) this.d;
                q7.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new wc.i(1, null));
                    this.d = list2;
                    this.f10279a = it2;
                    this.f10280b = null;
                    this.f10281c = 2;
                    throw null;
                }
            }
        } else {
            q7.b(obj);
            obj = this.d;
            it = this.f10282e.iterator();
            list = this.f10283f;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.d = list;
            this.f10279a = it;
            this.f10280b = obj;
            this.f10281c = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
