package ab;

import android.util.Log;
import v7.i8;
public final class y extends md.i implements td.q {
    public int f475a;
    public ee.c f476b;
    public Throwable f477c;

    @Override
    public final Object b(Object obj, Object obj2, md.c cVar) {
        ?? iVar = new md.i(3, cVar);
        iVar.f476b = (ee.c) obj;
        iVar.f477c = (Throwable) obj2;
        return iVar.invokeSuspend(id.i.f11390a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ld.a aVar = ld.a.f14658a;
        int i10 = this.f475a;
        if (i10 != 0) {
            if (i10 == 1) {
                i8.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            i8.b(obj);
            ee.c cVar = this.f476b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f477c);
            n1.b bVar = new n1.b(true);
            this.f476b = null;
            this.f475a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return id.i.f11390a;
    }
}
