package cb;

import android.util.Log;
import td.p;
import v7.i8;
public final class c extends md.i implements p {
    public Object f4685a;

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        ?? iVar = new md.i(2, cVar);
        iVar.f4685a = obj;
        return iVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        id.i iVar = id.i.f11386a;
        ((c) create((String) obj, (kd.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ld.a aVar = ld.a.f14658a;
        i8.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f4685a));
        return id.i.f11386a;
    }
}
