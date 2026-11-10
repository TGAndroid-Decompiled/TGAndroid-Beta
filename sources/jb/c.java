package jb;

import android.util.Log;
import m1.e1;
import m1.l0;
public final class c extends kd.j implements rd.p {
    public final int f16608a;
    public Object f16609b;

    public c(int i7, id.c cVar, int i10) {
        super(i7, cVar);
        this.f16608a = i10;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f16608a) {
            case 0:
                c cVar2 = new c(2, cVar, 0);
                cVar2.f16609b = obj;
                return cVar2;
            case 1:
                c cVar3 = new c(2, cVar, 1);
                cVar3.f16609b = obj;
                return cVar3;
            default:
                return new c((i) this.f16609b, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16608a) {
            case 0:
                gd.k kVar = gd.k.f13831a;
                ((c) create((String) obj, (id.c) obj2)).invokeSuspend(kVar);
                return kVar;
            case 1:
                return ((c) create((e1) obj, (id.c) obj2)).invokeSuspend(gd.k.f13831a);
            default:
                return ((c) create((i) obj, (id.c) obj2)).invokeSuspend(gd.k.f13831a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f16608a) {
            case 0:
                jd.a aVar = jd.a.f16646a;
                af.b.c(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f16609b));
                return gd.k.f13831a;
            case 1:
                jd.a aVar2 = jd.a.f16646a;
                af.b.c(obj);
                return Boolean.valueOf(!(((e1) this.f16609b) instanceof l0));
            default:
                jd.a aVar3 = jd.a.f16646a;
                af.b.c(obj);
                return (i) this.f16609b;
        }
    }

    public c(i iVar, id.c cVar) {
        super(2, cVar);
        this.f16608a = 2;
        this.f16609b = iVar;
    }
}
