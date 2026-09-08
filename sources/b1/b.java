package b1;

import com.google.android.gms.common.api.r;
import di.b7;
import java.util.concurrent.Executor;
import v0.i;
import v0.o;
public final class b implements rd.a {
    public final int f1943a;
    public final Executor f1944b;
    public final i f1945c;
    public final Object d;

    public b(e1.d dVar, Exception exc, Executor executor, i iVar) {
        this.f1943a = 3;
        this.d = exc;
        this.f1944b = executor;
        this.f1945c = iVar;
    }

    @Override
    public final Object invoke() {
        Object cVar;
        switch (this.f1943a) {
            case 0:
                this.f1944b.execute(new a1.e(12, this.f1945c, this.d));
                break;
            case 1:
                this.f1944b.execute(new a1.e(13, this.f1945c, (o) this.d));
                break;
            case 2:
                this.f1944b.execute(new h(this.f1945c, (w0.i) this.d, 0));
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
                    } else if (d.f1950b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c("Conditional create failed, failure: " + exc.getMessage(), 2);
                    }
                } else if (exc instanceof r) {
                    cVar = new w0.c("API is unsupported", 3);
                } else {
                    cVar = new w0.c("Conditional create failed, failure: " + exc, 2);
                }
                this.f1944b.execute(new b7(14, this.f1945c, cVar));
                break;
        }
        return gd.i.f10616a;
    }

    public b(Executor executor, i iVar, Object obj, int i10) {
        this.f1943a = i10;
        this.f1944b = executor;
        this.f1945c = iVar;
        this.d = obj;
    }
}
