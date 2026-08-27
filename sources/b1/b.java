package b1;

import com.google.android.gms.common.api.r;
import d5.u;
import java.util.concurrent.Executor;
import v0.i;
import v0.p;

public final class b implements ad.a {

    public final int f1884a;

    public final Executor f1885b;

    public final i f1886c;
    public final Object d;

    public b(e1.d dVar, Exception exc, Executor executor, i iVar) {
        this.f1884a = 3;
        this.d = exc;
        this.f1885b = executor;
        this.f1886c = iVar;
    }

    @Override
    public final Object invoke() {
        Object cVar;
        switch (this.f1884a) {
            case 0:
                this.f1885b.execute(new a1.e(9, this.f1886c, this.d));
                break;
            case 1:
                this.f1885b.execute(new a1.e(10, this.f1886c, (p) this.d));
                break;
            case 2:
                this.f1885b.execute(new h(this.f1886c, (w0.i) this.d, 0));
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
                    } else if (d.f1891b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c("Conditional create failed, failure: " + exc.getMessage(), 2);
                    }
                } else if (exc instanceof r) {
                    cVar = new w0.c("API is unsupported", 3);
                } else {
                    cVar = new w0.c("Conditional create failed, failure: " + exc, 2);
                }
                this.f1885b.execute(new u(2, this.f1886c, cVar));
                break;
        }
        return pc.i.f45696a;
    }

    public b(Executor executor, i iVar, Object obj, int i10) {
        this.f1884a = i10;
        this.f1885b = executor;
        this.f1886c = iVar;
        this.d = obj;
    }
}
