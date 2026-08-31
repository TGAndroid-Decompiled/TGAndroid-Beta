package la;

import android.util.Log;
import k7.q7;
public final class x extends wc.i implements dd.q {
    public int f12244a;
    public od.c f12245b;
    public Throwable f12246c;

    @Override
    public final Object a(Object obj, Object obj2, wc.c cVar) {
        ?? iVar = new wc.i(3, cVar);
        iVar.f12245b = (od.c) obj;
        iVar.f12246c = (Throwable) obj2;
        return iVar.invokeSuspend(sc.i.f47243a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        vc.a aVar = vc.a.f48962a;
        int i10 = this.f12244a;
        if (i10 != 0) {
            if (i10 == 1) {
                q7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            q7.b(obj);
            od.c cVar = this.f12245b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f12246c);
            n1.b bVar = new n1.b(true);
            this.f12245b = null;
            this.f12244a = 1;
            if (cVar.c(bVar, this) == aVar) {
                return aVar;
            }
        }
        return sc.i.f47243a;
    }
}
