package c1;

import android.util.Log;
import gb.k0;
import gb.l0;
import gd.k;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import oe.m;
import rd.l;
import sa.h;
import w0.i;
public final class c implements l {
    public final int f4347a;
    public final Object f4348b;

    public c(ie.d dVar, ie.c cVar) {
        this.f4347a = 5;
        this.f4348b = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f4347a) {
            case 0:
                f fVar = (f) this.f4348b;
                i e10 = (i) obj;
                j.e(e10, "e");
                fVar.g().execute(new b(fVar, e10, 2));
                return k.f13480a;
            case 1:
                d1.e eVar = (d1.e) this.f4348b;
                w0.d e11 = (w0.d) obj;
                j.e(e11, "e");
                Executor executor = eVar.f7606g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar, e11, 0));
                    return k.f13480a;
                }
                j.h("executor");
                throw null;
            case 2:
                e1.d dVar = (e1.d) this.f4348b;
                w0.d e12 = (w0.d) obj;
                j.e(e12, "e");
                Executor executor2 = dVar.f10284g;
                if (executor2 != null) {
                    executor2.execute(new e1.c(dVar, e12, 0));
                    return k.f13480a;
                }
                j.h("executor");
                throw null;
            case 3:
                m1.b ex = (m1.b) obj;
                j.e(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return new k0(((l0) this.f4348b).f13377a.a(null), null, null);
            case 4:
                if (obj == ((hd.c) this.f4348b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 5:
                Throwable th2 = (Throwable) obj;
                ((ie.d) this.f4348b).f(null);
                return k.f13480a;
            case 6:
                m mVar = (m) this.f4348b;
                int intValue = ((Integer) obj).intValue();
                return mVar.f21905e[intValue] + ": " + mVar.i(intValue).a();
            default:
                String str = (String) this.f4348b;
                q1.b bVar = (q1.b) obj;
                bVar.d(h.d, str);
                h.f(bVar, str);
                return null;
        }
    }

    public c(Object obj, int i7) {
        this.f4347a = i7;
        this.f4348b = obj;
    }

    public c(h hVar, String str) {
        this.f4347a = 7;
        this.f4348b = str;
    }
}
