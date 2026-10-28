package b1;

import com.google.android.gms.common.api.r;
import di.b4;
import java.util.concurrent.Executor;
import v0.i;
import v0.o;
public final class b implements ud.a {
    public final int f3103a;
    public final Executor f3104b;
    public final i f3105c;
    public final Object d;

    public b(e1.e eVar, Exception exc, Executor executor, i iVar) {
        this.f3103a = 3;
        this.d = exc;
        this.f3104b = executor;
        this.f3105c = iVar;
    }

    @Override
    public final Object invoke() {
        Object cVar;
        switch (this.f3103a) {
            case 0:
                this.f3104b.execute(new a1.f(19, this.f3105c, this.d));
                break;
            case 1:
                this.f3104b.execute(new a1.f(20, this.f3105c, (o) this.d));
                break;
            case 2:
                this.f3104b.execute(new h(this.f3105c, (w0.i) this.d, 0));
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
                    } else if (d.f3110b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c("Conditional create failed, failure: " + exc.getMessage(), 2);
                    }
                } else if (exc instanceof r) {
                    cVar = new w0.c("API is unsupported", 3);
                } else {
                    cVar = new w0.c("Conditional create failed, failure: " + exc, 2);
                }
                this.f3104b.execute(new b4(22, this.f3105c, cVar));
                break;
        }
        return jd.i.f15579a;
    }

    public b(Executor executor, i iVar, Object obj, int i10) {
        this.f3103a = i10;
        this.f3104b = executor;
        this.f3105c = iVar;
        this.d = obj;
    }
}
