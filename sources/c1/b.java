package c1;

import android.util.Log;
import db.j0;
import db.k0;
import dd.k;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import le.m;
import od.l;
import w0.i;
public final class b implements l {
    public final int f3961a;
    public final Object f3962b;

    public b(fe.d dVar, fe.c cVar) {
        this.f3961a = 5;
        this.f3962b = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f3961a) {
            case 0:
                e eVar = (e) this.f3962b;
                i e10 = (i) obj;
                j.e(e10, "e");
                eVar.f().execute(new a(eVar, e10, 2));
                return k.f8801a;
            case 1:
                d1.e eVar2 = (d1.e) this.f3962b;
                w0.d e11 = (w0.d) obj;
                j.e(e11, "e");
                Executor executor = eVar2.f7997g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar2, e11, 0));
                    return k.f8801a;
                }
                j.h("executor");
                throw null;
            case 2:
                l1.b ex = (l1.b) obj;
                j.e(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return new j0(((k0) this.f3962b).f8698a.a(null), null, null);
            case 3:
                e1.d dVar = (e1.d) this.f3962b;
                w0.d e12 = (w0.d) obj;
                j.e(e12, "e");
                Executor executor2 = dVar.f9324g;
                if (executor2 != null) {
                    executor2.execute(new e1.c(dVar, e12, 0));
                    return k.f8801a;
                }
                j.h("executor");
                throw null;
            case 4:
                if (obj == ((ed.d) this.f3962b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 5:
                Throwable th2 = (Throwable) obj;
                ((fe.d) this.f3962b).f(null);
                return k.f8801a;
            case 6:
                m mVar = (m) this.f3962b;
                int intValue = ((Integer) obj).intValue();
                return mVar.f18203e[intValue] + ": " + mVar.i(intValue).a();
            default:
                String str = (String) this.f3962b;
                p1.b bVar = (p1.b) obj;
                bVar.d(ra.i.d, str);
                ra.i.f(bVar, str);
                return null;
        }
    }

    public b(Object obj, int i3) {
        this.f3961a = i3;
        this.f3962b = obj;
    }

    public b(ra.i iVar, String str) {
        this.f3961a = 7;
        this.f3962b = str;
    }
}
