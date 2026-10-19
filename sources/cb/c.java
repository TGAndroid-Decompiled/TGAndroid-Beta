package cb;

import android.util.Log;
import td.p;
import v7.i8;
public final class c extends md.i implements p {
    public Object f5058a;

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        ?? iVar = new md.i(2, cVar);
        iVar.f5058a = obj;
        return iVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        id.i iVar = id.i.f12777a;
        ((c) create((String) obj, (kd.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ld.a aVar = ld.a.f16001a;
        i8.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f5058a));
        return id.i.f12777a;
    }
}
