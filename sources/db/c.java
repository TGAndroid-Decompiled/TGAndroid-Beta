package db;

import a8.jd;
import android.util.Log;
import ud.p;
public final class c extends nd.i implements p {
    public Object f8284a;

    @Override
    public final ld.c create(Object obj, ld.c cVar) {
        ?? iVar = new nd.i(2, cVar);
        iVar.f8284a = obj;
        return iVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        jd.i iVar = jd.i.f15579a;
        ((c) create((String) obj, (ld.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.f18411a;
        jd.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f8284a));
        return jd.i.f15579a;
    }
}
