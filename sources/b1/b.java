package b1;

import ai.pa;
import ci.v7;
import com.google.android.gms.common.api.r;
import java.util.concurrent.Executor;
import v0.i;
import v0.o;
public final class b implements td.a {
    public final int f3652a;
    public final Executor f3653b;
    public final i f3654c;
    public final Object d;

    public b(e1.e eVar, Exception exc, Executor executor, i iVar) {
        this.f3652a = 3;
        this.d = exc;
        this.f3653b = executor;
        this.f3654c = iVar;
    }

    @Override
    public final Object invoke() {
        Object cVar;
        switch (this.f3652a) {
            case 0:
                this.f3653b.execute(new pa(3, this.f3654c, this.d));
                break;
            case 1:
                this.f3653b.execute(new pa(4, this.f3654c, (o) this.d));
                break;
            case 2:
                this.f3653b.execute(new h(this.f3654c, (w0.i) this.d, 0));
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
                    } else if (d.f3659b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c("Conditional create failed, failure: " + exc.getMessage(), 2);
                    }
                } else if (exc instanceof r) {
                    cVar = new w0.c("API is unsupported", 3);
                } else {
                    cVar = new w0.c("Conditional create failed, failure: " + exc, 2);
                }
                this.f3653b.execute(new v7(13, this.f3654c, cVar));
                break;
        }
        return id.i.f12777a;
    }

    public b(Executor executor, i iVar, Object obj, int i10) {
        this.f3652a = i10;
        this.f3653b = executor;
        this.f3654c = iVar;
        this.d = obj;
    }
}
