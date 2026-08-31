package c1;

import dd.l;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import w0.i;
public final class c implements l {
    public final int f2029a;
    public final Object f2030b;

    public c(Object obj, int i10) {
        this.f2029a = i10;
        this.f2030b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f2029a) {
            case 0:
                f fVar = (f) this.f2030b;
                i e6 = (i) obj;
                j.e(e6, "e");
                fVar.f().execute(new a(fVar, e6, 2));
                break;
            case 1:
                d1.e eVar = (d1.e) this.f2030b;
                w0.d e10 = (w0.d) obj;
                j.e(e10, "e");
                Executor executor = eVar.f4156g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar, e10, 0));
                    break;
                } else {
                    j.h("executor");
                    throw null;
                }
            case 2:
                e1.d dVar = (e1.d) this.f2030b;
                w0.d e11 = (w0.d) obj;
                j.e(e11, "e");
                Executor executor2 = dVar.f4886g;
                if (executor2 != null) {
                    executor2.execute(new e1.c(dVar, e11, 0));
                    break;
                } else {
                    j.h("executor");
                    throw null;
                }
            default:
                if (obj == ((tc.c) this.f2030b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
        }
        return sc.i.f47243a;
    }
}
