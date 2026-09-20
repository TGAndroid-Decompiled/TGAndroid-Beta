package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class t {
    public final WeakReference f7926a;
    public final Executor f7927b;
    public final u f7928c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.f7928c = uVar;
        this.f7926a = new WeakReference(eVar);
        this.f7927b = executor;
    }
}
