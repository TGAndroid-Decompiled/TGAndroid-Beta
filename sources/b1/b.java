package b1;

import com.google.android.gms.common.api.r;
import di.y6;
import java.util.concurrent.Executor;
import v0.i;
import v0.p;
public final class b implements td.a {
    public final int f2040a;
    public final Executor f2041b;
    public final i f2042c;
    public final Object d;

    public b(e1.d dVar, Exception exc, Executor executor, i iVar) {
        this.f2040a = 3;
        this.d = exc;
        this.f2041b = executor;
        this.f2042c = iVar;
    }

    @Override
    public final Object invoke() {
        Object cVar;
        switch (this.f2040a) {
            case 0:
                this.f2041b.execute(new a1.f(14, this.f2042c, this.d));
                break;
            case 1:
                this.f2041b.execute(new a1.f(15, this.f2042c, (p) this.d));
                break;
            case 2:
                this.f2041b.execute(new h(this.f2042c, (w0.i) this.d, 0));
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
                    } else if (d.f2047b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c("Conditional create failed, failure: " + exc.getMessage(), 2);
                    }
                } else if (exc instanceof r) {
                    cVar = new w0.c("API is unsupported", 3);
                } else {
                    cVar = new w0.c("Conditional create failed, failure: " + exc, 2);
                }
                this.f2041b.execute(new y6(16, this.f2042c, cVar));
                break;
        }
        return id.i.f11390a;
    }

    public b(Executor executor, i iVar, Object obj, int i10) {
        this.f2040a = i10;
        this.f2041b = executor;
        this.f2042c = iVar;
        this.d = obj;
    }
}
