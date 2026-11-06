package h2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class v {
    public final WeakReference f14151a;
    public final Executor f14152b;
    public final w f14153c;

    public v(w wVar, b3.f fVar, Executor executor) {
        this.f14153c = wVar;
        this.f14151a = new WeakReference(fVar);
        this.f14152b = executor;
    }
}
