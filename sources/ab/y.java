package ab;

import android.util.Log;
import v7.i8;
public final class y extends md.i implements td.q {
    public int f473a;
    public ee.c f474b;
    public Throwable f475c;

    @Override
    public final Object b(Object obj, Object obj2, md.c cVar) {
        ?? iVar = new md.i(3, cVar);
        iVar.f474b = (ee.c) obj;
        iVar.f475c = (Throwable) obj2;
        return iVar.invokeSuspend(id.i.f12807a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ld.a aVar = ld.a.f16062a;
        int i10 = this.f473a;
        if (i10 != 0) {
            if (i10 == 1) {
                i8.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            i8.b(obj);
            ee.c cVar = this.f474b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f475c);
            n1.b bVar = new n1.b(true);
            this.f474b = null;
            this.f473a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return id.i.f12807a;
    }
}
