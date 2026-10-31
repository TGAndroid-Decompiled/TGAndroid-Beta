package b1;

import ad.j;
import com.google.android.gms.common.api.r;
import java.util.concurrent.Executor;
import v0.n;
import w0.i;
public final class b implements ld.a {
    public final int f1941a;
    public final Executor f1942b;
    public final v0.h f1943c;
    public final Object d;

    public b(e1.d dVar, Exception exc, Executor executor, v0.h hVar) {
        this.f1941a = 3;
        this.d = exc;
        this.f1942b = executor;
        this.f1943c = hVar;
    }

    @Override
    public final Object invoke() {
        Object cVar;
        switch (this.f1941a) {
            case 0:
                this.f1942b.execute(new a1.f(15, this.f1943c, this.d));
                break;
            case 1:
                this.f1942b.execute(new a1.f(16, this.f1943c, (n) this.d));
                break;
            case 2:
                this.f1942b.execute(new h(this.f1943c, (i) this.d, 0));
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
                    } else if (d.f1948b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c(2, "Conditional create failed, failure: " + exc.getMessage());
                    }
                } else if (exc instanceof r) {
                    cVar = new w0.c(3, "API is unsupported");
                } else {
                    cVar = new w0.c(2, "Conditional create failed, failure: " + exc);
                }
                this.f1942b.execute(new d1.e(4, this.f1943c, cVar));
                break;
        }
        return j.f401a;
    }

    public b(Executor executor, v0.h hVar, Object obj, int i10) {
        this.f1941a = i10;
        this.f1942b = executor;
        this.f1943c = hVar;
        this.d = obj;
    }
}
