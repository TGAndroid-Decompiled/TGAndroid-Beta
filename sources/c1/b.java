package c1;

import java.util.concurrent.Executor;
import rd.l;
import w0.i;
public final class b implements l {
    public final int f4156a;
    public final Object f4157b;

    public b(Object obj, int i10) {
        this.f4156a = i10;
        this.f4157b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f4156a) {
            case 0:
                e eVar = (e) this.f4157b;
                i e7 = (i) obj;
                kotlin.jvm.internal.i.e(e7, "e");
                eVar.f().execute(new a(eVar, e7, 2));
                break;
            case 1:
                d1.e eVar2 = (d1.e) this.f4157b;
                w0.d e10 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e10, "e");
                Executor executor = eVar2.f6494g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar2, e10, 0));
                    break;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
            case 2:
                e1.d dVar = (e1.d) this.f4157b;
                w0.d e11 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e11, "e");
                Executor executor2 = dVar.f8746g;
                if (executor2 != null) {
                    executor2.execute(new e1.c(dVar, e11, 0));
                    break;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
            default:
                if (obj == ((hd.c) this.f4157b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
        }
        return gd.i.f10616a;
    }
}
