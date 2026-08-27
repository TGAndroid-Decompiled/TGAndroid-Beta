package ia;

import android.util.Log;
import h7.k6;

public final class z extends tc.i implements ad.q {

    public int f11090a;

    public ld.c f11091b;

    public Throwable f11092c;

    @Override
    public final Object a(Object obj, Object obj2, tc.c cVar) {
        z zVar = new z(3, cVar);
        zVar.f11091b = (ld.c) obj;
        zVar.f11092c = (Throwable) obj2;
        return zVar.invokeSuspend(pc.i.f45696a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        sc.a aVar = sc.a.f47847a;
        int i10 = this.f11090a;
        if (i10 == 0) {
            k6.b(obj);
            ld.c cVar = this.f11091b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f11092c);
            n1.b bVar = new n1.b(true);
            this.f11091b = null;
            this.f11090a = 1;
            if (cVar.c(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k6.b(obj);
        }
        return pc.i.f45696a;
    }
}
