package bd;

import java.util.concurrent.Executor;
public final class a implements ld.l {
    public final int f2646a;
    public final Object f2647b;

    public a(Object obj, int i10) {
        this.f2646a = i10;
        this.f2647b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f2646a) {
            case 0:
                if (obj == ((e) this.f2647b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 1:
                c1.d dVar = (c1.d) this.f2647b;
                w0.i e = (w0.i) obj;
                kotlin.jvm.internal.i.e(e, "e");
                dVar.f().execute(new c1.a(dVar, e, 2));
                break;
            case 2:
                d1.f fVar = (d1.f) this.f2647b;
                w0.d e7 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e7, "e");
                Executor executor = fVar.f5642g;
                if (executor != null) {
                    executor.execute(new d1.a(fVar, e7, 0));
                    break;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
            default:
                e1.d dVar2 = (e1.d) this.f2647b;
                w0.d e10 = (w0.d) obj;
                kotlin.jvm.internal.i.e(e10, "e");
                Executor executor2 = dVar2.f6098g;
                if (executor2 != null) {
                    executor2.execute(new e1.c(dVar2, e10, 0));
                    break;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
        }
        return ad.j.f401a;
    }
}
