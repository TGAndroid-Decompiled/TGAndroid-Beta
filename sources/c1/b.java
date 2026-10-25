package c1;

import java.util.concurrent.Executor;
import ud.l;
import w0.i;
public final class b implements l {
    public final int f5918a;
    public final Object f5919b;

    public b(Object obj, int i10) {
        this.f5918a = i10;
        this.f5919b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f5918a) {
            case 0:
                e eVar = (e) this.f5919b;
                i e = (i) obj;
                kotlin.jvm.internal.i.e(e, "e");
                eVar.f().execute(new a(eVar, e, 2));
                break;
            case 1:
                d1.e eVar2 = (d1.e) this.f5919b;
                w0.d e10 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e10, "e");
                Executor executor = eVar2.f7833g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar2, e10, 0));
                    break;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
            case 2:
                e1.e eVar3 = (e1.e) this.f5919b;
                w0.d e11 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e11, "e");
                Executor executor2 = eVar3.f9619g;
                if (executor2 != null) {
                    executor2.execute(new e1.d(eVar3, e11, 0));
                    break;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
            default:
                if (obj == ((kd.c) this.f5919b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
        }
        return jd.i.f15580a;
    }
}
