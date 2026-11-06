package b1;

import com.google.android.gms.common.api.r;
import di.z0;
import gd.k;
import java.util.concurrent.Executor;
import v0.o;
import w0.i;
public final class b implements rd.a {
    public final int f2891a;
    public final Executor f2892b;
    public final v0.g f2893c;
    public final Object d;

    public b(e1.d dVar, Exception exc, Executor executor, v0.g gVar) {
        this.f2891a = 3;
        this.d = exc;
        this.f2892b = executor;
        this.f2893c = gVar;
    }

    @Override
    public final Object invoke() {
        Object cVar;
        switch (this.f2891a) {
            case 0:
                this.f2892b.execute(new a1.e(21, this.f2893c, this.d));
                break;
            case 1:
                this.f2892b.execute(new a1.e(22, this.f2893c, (o) this.d));
                break;
            case 2:
                this.f2892b.execute(new g(this.f2893c, (i) this.d, 0));
                break;
            default:
                Exception exc = (Exception) this.d;
                if (exc instanceof com.google.android.gms.common.api.f) {
                    int statusCode = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                    if (statusCode == 16) {
                        cVar = new w0.b(exc.getMessage());
                    } else if (statusCode == 17) {
                        cVar = new w0.c(3, "API is not supported: " + exc.getMessage());
                    } else if (statusCode == 8) {
                        cVar = new w0.f(exc.getMessage());
                    } else if (d.f2898b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c(2, "Conditional create failed, failure: " + exc.getMessage());
                    }
                } else if (exc instanceof r) {
                    cVar = new w0.c(3, "API is unsupported");
                } else {
                    cVar = new w0.c(2, "Conditional create failed, failure: " + exc);
                }
                this.f2892b.execute(new z0(26, this.f2893c, cVar));
                break;
        }
        return k.f13829a;
    }

    public b(Executor executor, v0.g gVar, Object obj, int i7) {
        this.f2891a = i7;
        this.f2892b = executor;
        this.f2893c = gVar;
        this.d = obj;
    }
}
