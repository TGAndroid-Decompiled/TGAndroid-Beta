package b1;

import ai.ba;
import ci.b9;
import com.google.android.gms.common.api.r;
import java.util.concurrent.Executor;
import v0.i;
import v0.p;
public final class b implements rd.a {
    public final int f2884a;
    public final Executor f2885b;
    public final i f2886c;
    public final Object d;

    public b(e1.d dVar, Exception exc, Executor executor, i iVar) {
        this.f2884a = 3;
        this.d = exc;
        this.f2885b = executor;
        this.f2886c = iVar;
    }

    @Override
    public final Object invoke() {
        Object cVar;
        switch (this.f2884a) {
            case 0:
                this.f2885b.execute(new ba(5, this.f2886c, this.d));
                break;
            case 1:
                this.f2885b.execute(new ba(6, this.f2886c, (p) this.d));
                break;
            case 2:
                this.f2885b.execute(new h(this.f2886c, (w0.i) this.d, 0));
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
                    } else if (d.f2891b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c("Conditional create failed, failure: " + exc.getMessage(), 2);
                    }
                } else if (exc instanceof r) {
                    cVar = new w0.c("API is unsupported", 3);
                } else {
                    cVar = new w0.c("Conditional create failed, failure: " + exc, 2);
                }
                this.f2885b.execute(new b9(8, this.f2886c, cVar));
                break;
        }
        return gd.i.f9617a;
    }

    public b(Executor executor, i iVar, Object obj, int i10) {
        this.f2884a = i10;
        this.f2885b = executor;
        this.f2886c = iVar;
        this.d = obj;
    }
}
