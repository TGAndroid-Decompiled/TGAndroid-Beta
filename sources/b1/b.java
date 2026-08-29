package b1;

import com.google.android.gms.common.api.r;
import java.util.concurrent.Executor;
import v0.i;
import v0.o;
public final class b implements bd.a {
    public final int f1878a;
    public final Executor f1879b;
    public final i f1880c;
    public final Object d;

    public b(e1.d dVar, Exception exc, Executor executor, i iVar) {
        this.f1878a = 3;
        this.d = exc;
        this.f1879b = executor;
        this.f1880c = iVar;
    }

    @Override
    public final Object invoke() {
        Object cVar;
        switch (this.f1878a) {
            case 0:
                this.f1879b.execute(new a1.e(7, this.f1880c, this.d));
                break;
            case 1:
                this.f1879b.execute(new a1.e(8, this.f1880c, (o) this.d));
                break;
            case 2:
                this.f1879b.execute(new h(this.f1880c, (w0.i) this.d, 0));
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
                    } else if (d.f1885b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c("Conditional create failed, failure: " + exc.getMessage(), 2);
                    }
                } else if (exc instanceof r) {
                    cVar = new w0.c("API is unsupported", 3);
                } else {
                    cVar = new w0.c("Conditional create failed, failure: " + exc, 2);
                }
                this.f1879b.execute(new a1.e(25, this.f1880c, cVar));
                break;
        }
        return qc.i.f46603a;
    }

    public b(Executor executor, i iVar, Object obj, int i10) {
        this.f1878a = i10;
        this.f1879b = executor;
        this.f1880c = iVar;
        this.d = obj;
    }
}
