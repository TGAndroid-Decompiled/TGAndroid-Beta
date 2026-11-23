package b1;

import com.google.android.gms.common.api.s;
import di.f2;
import gd.k;
import java.util.concurrent.Executor;
import v0.n;
import w0.i;
public final class b implements rd.a {
    public final int f2811a;
    public final Executor f2812b;
    public final v0.g f2813c;
    public final Object d;

    public b(e1.d dVar, Exception exc, Executor executor, v0.g gVar) {
        this.f2811a = 3;
        this.d = exc;
        this.f2812b = executor;
        this.f2813c = gVar;
    }

    @Override
    public final Object invoke() {
        Object cVar;
        switch (this.f2811a) {
            case 0:
                this.f2812b.execute(new a1.e(22, this.f2813c, this.d));
                break;
            case 1:
                this.f2812b.execute(new a1.e(23, this.f2813c, (n) this.d));
                break;
            case 2:
                this.f2812b.execute(new g(this.f2813c, (i) this.d, 0));
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
                    } else if (d.f2818b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c(2, "Conditional create failed, failure: " + exc.getMessage());
                    }
                } else if (exc instanceof s) {
                    cVar = new w0.c(3, "API is unsupported");
                } else {
                    cVar = new w0.c(2, "Conditional create failed, failure: " + exc);
                }
                this.f2812b.execute(new f2(18, this.f2813c, cVar));
                break;
        }
        return k.f13480a;
    }

    public b(Executor executor, v0.g gVar, Object obj, int i7) {
        this.f2811a = i7;
        this.f2812b = executor;
        this.f2813c = gVar;
        this.d = obj;
    }
}
