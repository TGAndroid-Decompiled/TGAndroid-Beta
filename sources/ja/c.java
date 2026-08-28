package ja;

import android.util.Log;
import g7.y5;
import zc.p;
public final class c extends sc.i implements p {
    public Object f14258a;

    @Override
    public final qc.c create(Object obj, qc.c cVar) {
        ?? iVar = new sc.i(2, cVar);
        iVar.f14258a = obj;
        return iVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        oc.i iVar = oc.i.f19197a;
        ((c) create((String) obj, (qc.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        rc.a aVar = rc.a.f47127a;
        y5.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f14258a));
        return oc.i.f19197a;
    }
}
