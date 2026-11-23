package jb;

import android.util.Log;
import c8.z;
import m1.e1;
import m1.l0;
public final class c extends kd.j implements rd.p {
    public final int f17437a;
    public Object f17438b;

    public c(int i7, id.c cVar, int i10) {
        super(i7, cVar);
        this.f17437a = i10;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f17437a) {
            case 0:
                c cVar2 = new c(2, cVar, 0);
                cVar2.f17438b = obj;
                return cVar2;
            case 1:
                c cVar3 = new c(2, cVar, 1);
                cVar3.f17438b = obj;
                return cVar3;
            default:
                return new c((i) this.f17438b, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17437a) {
            case 0:
                gd.k kVar = gd.k.f13480a;
                ((c) create((String) obj, (id.c) obj2)).invokeSuspend(kVar);
                return kVar;
            case 1:
                return ((c) create((e1) obj, (id.c) obj2)).invokeSuspend(gd.k.f13480a);
            default:
                return ((c) create((i) obj, (id.c) obj2)).invokeSuspend(gd.k.f13480a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f17437a) {
            case 0:
                jd.a aVar = jd.a.f17478a;
                z.b(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f17438b));
                return gd.k.f13480a;
            case 1:
                jd.a aVar2 = jd.a.f17478a;
                z.b(obj);
                return Boolean.valueOf(!(((e1) this.f17438b) instanceof l0));
            default:
                jd.a aVar3 = jd.a.f17478a;
                z.b(obj);
                return (i) this.f17438b;
        }
    }

    public c(i iVar, id.c cVar) {
        super(2, cVar);
        this.f17437a = 2;
        this.f17438b = iVar;
    }
}
