package k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k7.p7;
public final class f extends wc.i implements dd.p {
    public Iterator f9556a;
    public Object f9557b;
    public int f9558c;
    public Object d;
    public final List e;
    public final ArrayList f9559f;

    public f(List list, ArrayList arrayList, uc.c cVar) {
        super(2, cVar);
        this.e = list;
        this.f9559f = arrayList;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        f fVar = new f(this.e, this.f9559f, cVar);
        fVar.d = obj;
        return fVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create(obj, (uc.c) obj2)).invokeSuspend(sc.i.f44318a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        vc.a aVar = vc.a.f45727a;
        int i10 = this.f9558c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f9556a;
                    list = (List) this.d;
                    p7.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f9557b;
                Iterator it2 = this.f9556a;
                List list2 = (List) this.d;
                p7.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new wc.i(1, null));
                    this.d = list2;
                    this.f9556a = it2;
                    this.f9557b = null;
                    this.f9558c = 2;
                    throw null;
                }
            }
        } else {
            p7.b(obj);
            obj = this.d;
            it = this.e.iterator();
            list = this.f9559f;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.d = list;
            this.f9556a = it;
            this.f9557b = obj;
            this.f9558c = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
