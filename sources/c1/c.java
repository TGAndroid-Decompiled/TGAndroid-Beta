package c1;

import dd.l;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import w0.i;
public final class c implements l {
    public final int f1868a;
    public final Object f1869b;

    public c(Object obj, int i10) {
        this.f1868a = i10;
        this.f1869b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f1868a) {
            case 0:
                f fVar = (f) this.f1869b;
                i e = (i) obj;
                j.e(e, "e");
                fVar.f().execute(new a(fVar, e, 2));
                break;
            case 1:
                d1.e eVar = (d1.e) this.f1869b;
                w0.d e6 = (w0.d) obj;
                j.e(e6, "e");
                Executor executor = eVar.f4096g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar, e6, 0));
                    break;
                } else {
                    j.h("executor");
                    throw null;
                }
            case 2:
                e1.d dVar = (e1.d) this.f1869b;
                w0.d e10 = (w0.d) obj;
                j.e(e10, "e");
                Executor executor2 = dVar.f5052g;
                if (executor2 != null) {
                    executor2.execute(new e1.c(dVar, e10, 0));
                    break;
                } else {
                    j.h("executor");
                    throw null;
                }
            default:
                if (obj == ((tc.c) this.f1869b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
        }
        return sc.i.f44253a;
    }
}
