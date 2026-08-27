package ka;

import ad.p;
import android.util.Log;
import h7.k6;

public final class c extends tc.i implements p {

    public Object f15112a;

    @Override
    public final rc.c create(Object obj, rc.c cVar) {
        c cVar2 = new c(2, cVar);
        cVar2.f15112a = obj;
        return cVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((String) obj, (rc.c) obj2);
        pc.i iVar = pc.i.f45696a;
        cVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        sc.a aVar = sc.a.f47847a;
        k6.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f15112a));
        return pc.i.f45696a;
    }
}
