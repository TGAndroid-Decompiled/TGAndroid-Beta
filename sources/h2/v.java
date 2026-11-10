package h2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class v {
    public final WeakReference f14153a;
    public final Executor f14154b;
    public final w f14155c;

    public v(w wVar, b3.f fVar, Executor executor) {
        this.f14155c = wVar;
        this.f14153a = new WeakReference(fVar);
        this.f14154b = executor;
    }
}
