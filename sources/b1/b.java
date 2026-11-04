package b1;

import ci.e0;
import com.google.android.gms.common.api.r;
import dd.k;
import java.util.concurrent.Executor;
import v0.h;
import v0.n;
import w0.i;
public final class b implements od.a {
    public final int f2323a;
    public final Executor f2324b;
    public final h f2325c;
    public final Object d;

    public b(e1.d dVar, Exception exc, Executor executor, h hVar) {
        this.f2323a = 3;
        this.d = exc;
        this.f2324b = executor;
        this.f2325c = hVar;
    }

    @Override
    public final Object invoke() {
        Object cVar;
        switch (this.f2323a) {
            case 0:
                this.f2324b.execute(new a1.f(8, this.f2325c, this.d));
                break;
            case 1:
                this.f2324b.execute(new a1.f(9, this.f2325c, (n) this.d));
                break;
            case 2:
                this.f2324b.execute(new g(this.f2325c, (i) this.d, 0));
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
                    } else if (d.f2330b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c(2, "Conditional create failed, failure: " + exc.getMessage());
                    }
                } else if (exc instanceof r) {
                    cVar = new w0.c(3, "API is unsupported");
                } else {
                    cVar = new w0.c(2, "Conditional create failed, failure: " + exc);
                }
                this.f2324b.execute(new e0(26, this.f2325c, cVar));
                break;
        }
        return k.f8801a;
    }

    public b(Executor executor, h hVar, Object obj, int i3) {
        this.f2323a = i3;
        this.f2324b = executor;
        this.f2325c = hVar;
        this.d = obj;
    }
}
