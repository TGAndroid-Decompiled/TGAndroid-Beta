package db;

import android.util.Log;
import ld.p;
public final class c extends ed.j implements p {
    public Object f5837a;

    @Override
    public final cd.c create(Object obj, cd.c cVar) {
        ?? jVar = new ed.j(2, cVar);
        jVar.f5837a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        ad.j jVar = ad.j.f401a;
        ((c) create((String) obj, (cd.c) obj2)).invokeSuspend(jVar);
        return jVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        dd.a aVar = dd.a.f5864a;
        l9.b.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f5837a));
        return ad.j.f401a;
    }
}
