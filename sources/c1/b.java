package c1;

import java.util.concurrent.Executor;
import rd.l;
import w0.i;
public final class b implements l {
    public final int f4062a;
    public final Object f4063b;

    public b(Object obj, int i10) {
        this.f4062a = i10;
        this.f4063b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f4062a) {
            case 0:
                e eVar = (e) this.f4063b;
                i e = (i) obj;
                kotlin.jvm.internal.i.e(e, "e");
                eVar.f().execute(new a(eVar, e, 2));
                break;
            case 1:
                d1.e eVar2 = (d1.e) this.f4063b;
                w0.d e7 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e7, "e");
                Executor executor = eVar2.f6184g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar2, e7, 0));
                    break;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
            case 2:
                e1.d dVar = (e1.d) this.f4063b;
                w0.d e10 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e10, "e");
                Executor executor2 = dVar.f7170g;
                if (executor2 != null) {
                    executor2.execute(new e1.c(dVar, e10, 0));
                    break;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
            default:
                if (obj == ((hd.c) this.f4063b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
        }
        return gd.i.f8748a;
    }
}
