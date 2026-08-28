package ha;

import android.util.Log;
import g7.y5;
public final class y extends sc.i implements zc.q {
    public int f10378a;
    public kd.c f10379b;
    public Throwable f10380c;

    @Override
    public final Object a(Object obj, Object obj2, sc.c cVar) {
        ?? iVar = new sc.i(3, cVar);
        iVar.f10379b = (kd.c) obj;
        iVar.f10380c = (Throwable) obj2;
        return iVar.invokeSuspend(oc.i.f19197a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        rc.a aVar = rc.a.f47127a;
        int i9 = this.f10378a;
        if (i9 != 0) {
            if (i9 == 1) {
                y5.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            y5.b(obj);
            kd.c cVar = this.f10379b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f10380c);
            n1.b bVar = new n1.b(true);
            this.f10379b = null;
            this.f10378a = 1;
            if (cVar.c(bVar, this) == aVar) {
                return aVar;
            }
        }
        return oc.i.f19197a;
    }
}
