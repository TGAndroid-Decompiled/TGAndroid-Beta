package bb;

import android.util.Log;
import sd.p;
import v7.a8;
public final class d extends ld.j implements p {
    public Object f3812a;

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        ?? jVar = new ld.j(2, cVar);
        jVar.f3812a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        hd.i iVar = hd.i.f11090a;
        ((d) create((String) obj, (jd.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        kd.a aVar = kd.a.f14780a;
        a8.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f3812a));
        return hd.i.f11090a;
    }
}
