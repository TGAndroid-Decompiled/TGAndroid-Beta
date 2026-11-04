package db;

import android.util.Log;
import b8.ib;
public final class y0 extends hd.j implements od.q {
    public int f8757a;
    public zd.c f8758b;
    public Throwable f8759c;
    public final e1 d;

    public y0(e1 e1Var, fd.c cVar) {
        super(3, cVar);
        this.d = e1Var;
    }

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        y0 y0Var = new y0(this.d, (fd.c) obj3);
        y0Var.f8758b = (zd.c) obj;
        y0Var.f8759c = (Throwable) obj2;
        return y0Var.invokeSuspend(dd.k.f8801a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.f12241a;
        int i3 = this.f8757a;
        if (i3 != 0) {
            if (i3 == 1) {
                ib.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ib.b(obj);
            zd.c cVar = this.f8758b;
            Throwable th2 = this.f8759c;
            n0 a10 = this.d.f8645b.a(null);
            j0 j0Var = new j0(a10, null, null);
            Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th2.getMessage() + ". Emit fallback session " + a10.f8706a);
            this.f8758b = null;
            this.f8757a = 1;
            if (cVar.b(j0Var, this) == aVar) {
                return aVar;
            }
        }
        return dd.k.f8801a;
    }
}
