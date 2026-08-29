package ja;

import android.util.Log;
import i7.c7;
public final class y extends uc.i implements bd.q {
    public int f11413a;
    public md.c f11414b;
    public Throwable f11415c;

    @Override
    public final Object b(Object obj, Object obj2, uc.c cVar) {
        ?? iVar = new uc.i(3, cVar);
        iVar.f11414b = (md.c) obj;
        iVar.f11415c = (Throwable) obj2;
        return iVar.invokeSuspend(qc.i.f46603a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.f48210a;
        int i10 = this.f11413a;
        if (i10 != 0) {
            if (i10 == 1) {
                c7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            c7.b(obj);
            md.c cVar = this.f11414b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f11415c);
            n1.b bVar = new n1.b(true);
            this.f11414b = null;
            this.f11413a = 1;
            if (cVar.c(bVar, this) == aVar) {
                return aVar;
            }
        }
        return qc.i.f46603a;
    }
}
