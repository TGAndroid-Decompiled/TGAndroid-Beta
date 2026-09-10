package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class t {
    public final WeakReference f7226a;
    public final Executor f7227b;
    public final u f7228c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.f7228c = uVar;
        this.f7226a = new WeakReference(eVar);
        this.f7227b = executor;
    }
}
