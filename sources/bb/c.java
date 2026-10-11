package bb;

import android.util.Log;
import sd.p;
import v7.a8;
public final class c extends ld.j implements p {
    public Object f3813a;

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        ?? jVar = new ld.j(2, cVar);
        jVar.f3813a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        hd.i iVar = hd.i.f11091a;
        ((c) create((String) obj, (jd.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        kd.a aVar = kd.a.f14783a;
        a8.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f3813a));
        return hd.i.f11091a;
    }
}
