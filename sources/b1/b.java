package b1;

import ai.ca;
import ci.y8;
import com.google.android.gms.common.api.r;
import java.util.concurrent.Executor;
import v0.i;
import v0.o;
public final class b implements sd.a {
    public final int f3187a;
    public final Executor f3188b;
    public final i f3189c;
    public final Object d;

    public b(e1.d dVar, Exception exc, Executor executor, i iVar) {
        this.f3187a = 3;
        this.d = exc;
        this.f3188b = executor;
        this.f3189c = iVar;
    }

    @Override
    public final Object invoke() {
        Object cVar;
        switch (this.f3187a) {
            case 0:
                this.f3188b.execute(new ca(5, this.f3189c, this.d));
                break;
            case 1:
                this.f3188b.execute(new ca(6, this.f3189c, (o) this.d));
                break;
            case 2:
                this.f3188b.execute(new h(this.f3189c, (w0.i) this.d, 0));
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
                    } else if (d.f3194b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c("Conditional create failed, failure: " + exc.getMessage(), 2);
                    }
                } else if (exc instanceof r) {
                    cVar = new w0.c("API is unsupported", 3);
                } else {
                    cVar = new w0.c("Conditional create failed, failure: " + exc, 2);
                }
                this.f3188b.execute(new y8(8, this.f3189c, cVar));
                break;
        }
        return hd.i.f11090a;
    }

    public b(Executor executor, i iVar, Object obj, int i10) {
        this.f3187a = i10;
        this.f3188b = executor;
        this.f3189c = iVar;
        this.d = obj;
    }
}
