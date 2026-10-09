package b1;

import ai.ca;
import ci.y8;
import com.google.android.gms.common.api.r;
import java.util.concurrent.Executor;
import v0.i;
import v0.o;
public final class b implements sd.a {
    public final int f3189a;
    public final Executor f3190b;
    public final i f3191c;
    public final Object d;

    public b(e1.d dVar, Exception exc, Executor executor, i iVar) {
        this.f3189a = 3;
        this.d = exc;
        this.f3190b = executor;
        this.f3191c = iVar;
    }

    @Override
    public final Object invoke() {
        Object cVar;
        switch (this.f3189a) {
            case 0:
                this.f3190b.execute(new ca(5, this.f3191c, this.d));
                break;
            case 1:
                this.f3190b.execute(new ca(6, this.f3191c, (o) this.d));
                break;
            case 2:
                this.f3190b.execute(new h(this.f3191c, (w0.i) this.d, 0));
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
                    } else if (d.f3196b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c("Conditional create failed, failure: " + exc.getMessage(), 2);
                    }
                } else if (exc instanceof r) {
                    cVar = new w0.c("API is unsupported", 3);
                } else {
                    cVar = new w0.c("Conditional create failed, failure: " + exc, 2);
                }
                this.f3190b.execute(new y8(8, this.f3191c, cVar));
                break;
        }
        return hd.i.f11092a;
    }

    public b(Executor executor, i iVar, Object obj, int i10) {
        this.f3189a = i10;
        this.f3190b = executor;
        this.f3191c = iVar;
        this.d = obj;
    }
}
