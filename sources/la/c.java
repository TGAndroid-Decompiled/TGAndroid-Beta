package la;

import android.util.Log;
import bd.p;
import i7.c7;
public final class c extends uc.i implements p {
    public Object f15116a;

    @Override
    public final sc.c create(Object obj, sc.c cVar) {
        ?? iVar = new uc.i(2, cVar);
        iVar.f15116a = obj;
        return iVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        qc.i iVar = qc.i.f46603a;
        ((c) create((String) obj, (sc.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.f48210a;
        c7.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f15116a));
        return qc.i.f46603a;
    }
}
