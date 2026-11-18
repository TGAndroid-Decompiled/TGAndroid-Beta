package jb;

import android.util.Log;
import m1.e1;
import m1.l0;
public final class c extends kd.j implements rd.p {
    public final int f17346a;
    public Object f17347b;

    public c(int i7, id.c cVar, int i10) {
        super(i7, cVar);
        this.f17346a = i10;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f17346a) {
            case 0:
                c cVar2 = new c(2, cVar, 0);
                cVar2.f17347b = obj;
                return cVar2;
            case 1:
                c cVar3 = new c(2, cVar, 1);
                cVar3.f17347b = obj;
                return cVar3;
            default:
                return new c((i) this.f17347b, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17346a) {
            case 0:
                gd.k kVar = gd.k.f13488a;
                ((c) create((String) obj, (id.c) obj2)).invokeSuspend(kVar);
                return kVar;
            case 1:
                return ((c) create((e1) obj, (id.c) obj2)).invokeSuspend(gd.k.f13488a);
            default:
                return ((c) create((i) obj, (id.c) obj2)).invokeSuspend(gd.k.f13488a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f17346a) {
            case 0:
                jd.a aVar = jd.a.f17384a;
                b7.h.b(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f17347b));
                return gd.k.f13488a;
            case 1:
                jd.a aVar2 = jd.a.f17384a;
                b7.h.b(obj);
                return Boolean.valueOf(!(((e1) this.f17347b) instanceof l0));
            default:
                jd.a aVar3 = jd.a.f17384a;
                b7.h.b(obj);
                return (i) this.f17347b;
        }
    }

    public c(i iVar, id.c cVar) {
        super(2, cVar);
        this.f17346a = 2;
        this.f17347b = iVar;
    }
}
