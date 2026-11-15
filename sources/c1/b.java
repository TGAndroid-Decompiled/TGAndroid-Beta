package c1;

import android.util.Log;
import gb.j0;
import gb.k0;
import gd.k;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import oe.m;
import rd.l;
import sa.h;
import w0.i;
public final class b implements l {
    public final int f4068a;
    public final Object f4069b;

    public b(ie.d dVar, ie.c cVar) {
        this.f4068a = 5;
        this.f4069b = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f4068a) {
            case 0:
                f fVar = (f) this.f4069b;
                i e10 = (i) obj;
                j.e(e10, "e");
                fVar.g().execute(new a(fVar, e10, 2));
                return k.f13173a;
            case 1:
                d1.e eVar = (d1.e) this.f4069b;
                w0.d e11 = (w0.d) obj;
                j.e(e11, "e");
                Executor executor = eVar.f7329g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar, e11, 0));
                    return k.f13173a;
                }
                j.h("executor");
                throw null;
            case 2:
                e1.d dVar = (e1.d) this.f4069b;
                w0.d e12 = (w0.d) obj;
                j.e(e12, "e");
                Executor executor2 = dVar.f9976g;
                if (executor2 != null) {
                    executor2.execute(new e1.c(dVar, e12, 0));
                    return k.f13173a;
                }
                j.h("executor");
                throw null;
            case 3:
                m1.b ex = (m1.b) obj;
                j.e(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return new j0(((k0) this.f4069b).f13065a.a(null), null, null);
            case 4:
                if (obj == ((hd.c) this.f4069b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 5:
                Throwable th2 = (Throwable) obj;
                ((ie.d) this.f4069b).f(null);
                return k.f13173a;
            case 6:
                m mVar = (m) this.f4069b;
                int intValue = ((Integer) obj).intValue();
                return mVar.f21448e[intValue] + ": " + mVar.i(intValue).a();
            default:
                String str = (String) this.f4069b;
                q1.b bVar = (q1.b) obj;
                bVar.d(h.d, str);
                h.f(bVar, str);
                return null;
        }
    }

    public b(Object obj, int i7) {
        this.f4068a = i7;
        this.f4069b = obj;
    }

    public b(h hVar, String str) {
        this.f4068a = 7;
        this.f4069b = str;
    }
}
