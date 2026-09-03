package la;

import android.util.Log;
import k7.p7;
public final class x extends wc.i implements dd.q {
    public int f11937a;
    public od.c f11938b;
    public Throwable f11939c;

    @Override
    public final Object a(Object obj, Object obj2, wc.c cVar) {
        ?? iVar = new wc.i(3, cVar);
        iVar.f11938b = (od.c) obj;
        iVar.f11939c = (Throwable) obj2;
        return iVar.invokeSuspend(sc.i.f44318a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        vc.a aVar = vc.a.f45727a;
        int i10 = this.f11937a;
        if (i10 != 0) {
            if (i10 == 1) {
                p7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            p7.b(obj);
            od.c cVar = this.f11938b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f11939c);
            n1.b bVar = new n1.b(true);
            this.f11938b = null;
            this.f11937a = 1;
            if (cVar.c(bVar, this) == aVar) {
                return aVar;
            }
        }
        return sc.i.f44318a;
    }
}
