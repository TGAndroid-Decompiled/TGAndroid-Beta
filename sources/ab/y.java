package ab;

import android.util.Log;
import v7.i8;
public final class y extends md.i implements td.q {
    public int f471a;
    public ee.c f472b;
    public Throwable f473c;

    @Override
    public final Object b(Object obj, Object obj2, md.c cVar) {
        ?? iVar = new md.i(3, cVar);
        iVar.f472b = (ee.c) obj;
        iVar.f473c = (Throwable) obj2;
        return iVar.invokeSuspend(id.i.f11386a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ld.a aVar = ld.a.f14658a;
        int i10 = this.f471a;
        if (i10 != 0) {
            if (i10 == 1) {
                i8.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            i8.b(obj);
            ee.c cVar = this.f472b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f473c);
            n1.b bVar = new n1.b(true);
            this.f472b = null;
            this.f471a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return id.i.f11386a;
    }
}
