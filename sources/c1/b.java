package c1;

import java.util.concurrent.Executor;
import w0.i;
import zc.l;
public final class b implements l {
    public final int f2081a;
    public final Object f2082b;

    public b(Object obj, int i9) {
        this.f2081a = i9;
        this.f2082b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f2081a) {
            case 0:
                e eVar = (e) this.f2082b;
                i e10 = (i) obj;
                kotlin.jvm.internal.i.e(e10, "e");
                eVar.f().execute(new a(eVar, e10, 2));
                break;
            case 1:
                d1.e eVar2 = (d1.e) this.f2082b;
                w0.d e11 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e11, "e");
                Executor executor = eVar2.f4251g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar2, e11, 0));
                    break;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
            case 2:
                e1.d dVar = (e1.d) this.f2082b;
                w0.d e12 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e12, "e");
                Executor executor2 = dVar.f4800g;
                if (executor2 != null) {
                    executor2.execute(new e1.c(dVar, e12, 0));
                    break;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
            default:
                if (obj == ((pc.c) this.f2082b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
        }
        return oc.i.f19197a;
    }
}
