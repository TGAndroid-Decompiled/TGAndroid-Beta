package bb;

import android.util.Log;
import rd.p;
import v7.t7;
public final class c extends kd.j implements p {
    public Object f3457a;

    @Override
    public final id.c create(Object obj, id.c cVar) {
        ?? jVar = new kd.j(2, cVar);
        jVar.f3457a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        gd.i iVar = gd.i.f9616a;
        ((c) create((String) obj, (id.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f12967a;
        t7.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f3457a));
        return gd.i.f9616a;
    }
}
