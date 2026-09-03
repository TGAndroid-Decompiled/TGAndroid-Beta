package na;

import android.util.Log;
import dd.p;
import k7.p7;
public final class c extends wc.i implements p {
    public Object f14857a;

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        ?? iVar = new wc.i(2, cVar);
        iVar.f14857a = obj;
        return iVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        sc.i iVar = sc.i.f44318a;
        ((c) create((String) obj, (uc.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        vc.a aVar = vc.a.f45727a;
        p7.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f14857a));
        return sc.i.f44318a;
    }
}
