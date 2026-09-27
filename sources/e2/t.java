package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class t {
    public final WeakReference f7910a;
    public final Executor f7911b;
    public final u f7912c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.f7912c = uVar;
        this.f7910a = new WeakReference(eVar);
        this.f7911b = executor;
    }
}
