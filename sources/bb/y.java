package bb;

import a8.jd;
import android.util.Log;
public final class y extends nd.i implements ud.q {
    public int f3829a;
    public fe.c f3830b;
    public Throwable f3831c;

    @Override
    public final Object a(Object obj, Object obj2, nd.c cVar) {
        ?? iVar = new nd.i(3, cVar);
        iVar.f3830b = (fe.c) obj;
        iVar.f3831c = (Throwable) obj2;
        return iVar.invokeSuspend(jd.i.f15580a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.f18412a;
        int i10 = this.f3829a;
        if (i10 != 0) {
            if (i10 == 1) {
                jd.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            jd.b(obj);
            fe.c cVar = this.f3830b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f3831c);
            n1.b bVar = new n1.b(true);
            this.f3830b = null;
            this.f3829a = 1;
            if (cVar.b(bVar, this) == aVar) {
                return aVar;
            }
        }
        return jd.i.f15580a;
    }
}
