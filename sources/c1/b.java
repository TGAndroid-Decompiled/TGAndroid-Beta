package c1;

import bd.l;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import w0.i;
public final class b implements l {
    public final int f2750a;
    public final Object f2751b;

    public b(Object obj, int i10) {
        this.f2750a = i10;
        this.f2751b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f2750a) {
            case 0:
                e eVar = (e) this.f2751b;
                i e10 = (i) obj;
                j.e(e10, "e");
                eVar.f().execute(new a(eVar, e10, 2));
                break;
            case 1:
                d1.e eVar2 = (d1.e) this.f2751b;
                w0.d e11 = (w0.d) obj;
                j.e(e11, "e");
                Executor executor = eVar2.f5260g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar2, e11, 0));
                    break;
                } else {
                    j.h("executor");
                    throw null;
                }
            case 2:
                e1.d dVar = (e1.d) this.f2751b;
                w0.d e12 = (w0.d) obj;
                j.e(e12, "e");
                Executor executor2 = dVar.f5770g;
                if (executor2 != null) {
                    executor2.execute(new e1.c(dVar, e12, 0));
                    break;
                } else {
                    j.h("executor");
                    throw null;
                }
            default:
                if (obj == ((rc.c) this.f2751b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
        }
        return qc.i.f46603a;
    }
}
