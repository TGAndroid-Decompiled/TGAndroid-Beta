package c1;

import ad.l;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import w0.i;

public final class b implements l {

    public final int f2220a;

    public final Object f2221b;

    public b(Object obj, int i10) {
        this.f2220a = i10;
        this.f2221b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f2220a) {
            case 0:
                e eVar = (e) this.f2221b;
                i e9 = (i) obj;
                j.e(e9, "e");
                eVar.f().execute(new a(eVar, e9, 2));
                break;
            case 1:
                d1.e eVar2 = (d1.e) this.f2221b;
                w0.d e10 = (w0.d) obj;
                j.e(e10, "e");
                Executor executor = eVar2.f4693g;
                if (executor == null) {
                    j.h("executor");
                    throw null;
                }
                executor.execute(new d1.a(eVar2, e10, 0));
                break;
                break;
            case 2:
                e1.d dVar = (e1.d) this.f2221b;
                w0.d e11 = (w0.d) obj;
                j.e(e11, "e");
                Executor executor2 = dVar.f5157g;
                if (executor2 == null) {
                    j.h("executor");
                    throw null;
                }
                executor2.execute(new e1.c(dVar, e11, 0));
                break;
                break;
            default:
                return obj == ((qc.c) this.f2221b) ? "(this Collection)" : String.valueOf(obj);
        }
        return pc.i.f45696a;
    }
}
