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
public final class b implements l {
    public final int f5252a;
    public final Object f5253b;

    public b(ie.d dVar, ie.c cVar) {
        this.f5252a = 5;
        this.f5253b = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f5252a) {
            case 0:
                e eVar = (e) this.f5253b;
                i e10 = (i) obj;
                j.e(e10, "e");
                eVar.g().execute(new a(eVar, e10, 2));
                return k.f13831a;
            case 1:
                d1.e eVar2 = (d1.e) this.f5253b;
                w0.d e11 = (w0.d) obj;
                j.e(e11, "e");
                Executor executor = eVar2.f7945g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar2, e11, 0));
                    return k.f13831a;
                }
                j.h("executor");
                throw null;
            case 2:
                e1.d dVar = (e1.d) this.f5253b;
                w0.d e12 = (w0.d) obj;
                j.e(e12, "e");
                Executor executor2 = dVar.f10145g;
                if (executor2 != null) {
                    executor2.execute(new e1.c(dVar, e12, 0));
                    return k.f13831a;
                }
                j.h("executor");
                throw null;
            case 3:
                m1.b ex = (m1.b) obj;
                j.e(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return new k0(((l0) this.f5253b).f13729a.a(null), null, null);
            case 4:
                if (obj == ((hd.c) this.f5253b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 5:
                Throwable th2 = (Throwable) obj;
                ((ie.d) this.f5253b).f(null);
                return k.f13831a;
            case 6:
                m mVar = (m) this.f5253b;
                int intValue = ((Integer) obj).intValue();
                return mVar.f20930e[intValue] + ": " + mVar.i(intValue).a();
            default:
                String str = (String) this.f5253b;
                q1.b bVar = (q1.b) obj;
                bVar.d(h.d, str);
                h.f(bVar, str);
                return null;
        }
    }

    public b(Object obj, int i7) {
        this.f5252a = i7;
        this.f5253b = obj;
    }

    public b(h hVar, String str) {
        this.f5252a = 7;
        this.f5253b = str;
    }
}
