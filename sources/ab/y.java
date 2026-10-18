package ab;

import android.util.Log;
import v7.i8;
public final class y extends md.i implements td.q {
    public int f474a;
    public ee.c f475b;
    public Throwable f476c;

    @Override
    public final Object b(Object obj, Object obj2, md.c cVar) {
        ?? iVar = new md.i(3, cVar);
        iVar.f475b = (ee.c) obj;
        iVar.f476c = (Throwable) obj2;
        return iVar.invokeSuspend(id.i.f12777a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ld.a aVar = ld.a.f16000a;
        int i10 = this.f474a;
        if (i10 != 0) {
            if (i10 == 1) {
                i8.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            i8.b(obj);
            ee.c cVar = this.f475b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f476c);
            n1.b bVar = new n1.b(true);
            this.f475b = null;
            this.f474a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return id.i.f12777a;
    }
}
