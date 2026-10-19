package c1;

import java.util.concurrent.Executor;
import td.l;
import w0.i;
public final class b implements l {
    public final int f4480a;
    public final Object f4481b;

    public b(Object obj, int i10) {
        this.f4480a = i10;
        this.f4481b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f4480a) {
            case 0:
                e eVar = (e) this.f4481b;
                i e = (i) obj;
                kotlin.jvm.internal.i.e(e, "e");
                eVar.f().execute(new a(eVar, e, 2));
                break;
            case 1:
                d1.e eVar2 = (d1.e) this.f4481b;
                w0.d e7 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e7, "e");
                Executor executor = eVar2.f7731g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar2, e7, 0));
                    break;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
            case 2:
                e1.e eVar3 = (e1.e) this.f4481b;
                w0.d e10 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e10, "e");
                Executor executor2 = eVar3.f8186g;
                if (executor2 != null) {
                    executor2.execute(new e1.d(eVar3, e10, 0));
                    break;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
            default:
                if (obj == ((jd.c) this.f4481b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
        }
        return id.i.f12777a;
    }
}
