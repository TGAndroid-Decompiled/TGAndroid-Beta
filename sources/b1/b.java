package b1;

import com.google.android.gms.common.api.r;
import di.x6;
import java.util.concurrent.Executor;
import v0.i;
import v0.o;
public final class b implements td.a {
    public final int f2036a;
    public final Executor f2037b;
    public final i f2038c;
    public final Object d;

    public b(e1.d dVar, Exception exc, Executor executor, i iVar) {
        this.f2036a = 3;
        this.d = exc;
        this.f2037b = executor;
        this.f2038c = iVar;
    }

    @Override
    public final Object invoke() {
        Object cVar;
        switch (this.f2036a) {
            case 0:
                this.f2037b.execute(new a1.f(14, this.f2038c, this.d));
                break;
            case 1:
                this.f2037b.execute(new a1.f(15, this.f2038c, (o) this.d));
                break;
            case 2:
                this.f2037b.execute(new h(this.f2038c, (w0.i) this.d, 0));
                break;
            default:
                Exception exc = (Exception) this.d;
                if (exc instanceof com.google.android.gms.common.api.f) {
                    int statusCode = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                    if (statusCode == 16) {
                        cVar = new w0.b(exc.getMessage());
                    } else if (statusCode == 17) {
                        cVar = new w0.c("API is not supported: " + exc.getMessage(), 3);
                    } else if (statusCode == 8) {
                        cVar = new w0.f(exc.getMessage());
                    } else if (d.f2043b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c("Conditional create failed, failure: " + exc.getMessage(), 2);
                    }
                } else if (exc instanceof r) {
                    cVar = new w0.c("API is unsupported", 3);
                } else {
                    cVar = new w0.c("Conditional create failed, failure: " + exc, 2);
                }
                this.f2037b.execute(new x6(16, this.f2038c, cVar));
                break;
        }
        return id.i.f11386a;
    }

    public b(Executor executor, i iVar, Object obj, int i10) {
        this.f2036a = i10;
        this.f2037b = executor;
        this.f2038c = iVar;
        this.d = obj;
    }
}
