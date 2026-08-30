package la;

import android.util.Log;
import k7.p7;
public final class x extends wc.i implements dd.q {
    public int f11827a;
    public od.c f11828b;
    public Throwable f11829c;

    @Override
    public final Object a(Object obj, Object obj2, wc.c cVar) {
        ?? iVar = new wc.i(3, cVar);
        iVar.f11828b = (od.c) obj;
        iVar.f11829c = (Throwable) obj2;
        return iVar.invokeSuspend(sc.i.f44253a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        vc.a aVar = vc.a.f45663a;
        int i10 = this.f11827a;
        if (i10 != 0) {
            if (i10 == 1) {
                p7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            p7.b(obj);
            od.c cVar = this.f11828b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f11829c);
            n1.b bVar = new n1.b(true);
            this.f11828b = null;
            this.f11827a = 1;
            if (cVar.c(bVar, this) == aVar) {
                return aVar;
            }
        }
        return sc.i.f44253a;
    }
}
