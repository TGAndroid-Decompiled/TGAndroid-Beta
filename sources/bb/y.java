package bb;

import android.util.Log;
public final class y extends ed.j implements ld.q {
    public int f2630a;
    public wd.c f2631b;
    public Throwable f2632c;

    @Override
    public final Object a(Object obj, Object obj2, ed.c cVar) {
        ?? jVar = new ed.j(3, cVar);
        jVar.f2631b = (wd.c) obj;
        jVar.f2632c = (Throwable) obj2;
        return jVar.invokeSuspend(ad.j.f401a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        dd.a aVar = dd.a.f5864a;
        int i10 = this.f2630a;
        if (i10 != 0) {
            if (i10 == 1) {
                l9.b.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l9.b.b(obj);
            wd.c cVar = this.f2631b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f2632c);
            n1.b bVar = new n1.b(true);
            this.f2631b = null;
            this.f2630a = 1;
            if (cVar.b(bVar, this) == aVar) {
                return aVar;
            }
        }
        return ad.j.f401a;
    }
}
