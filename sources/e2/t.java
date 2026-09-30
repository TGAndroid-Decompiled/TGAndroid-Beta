package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class t {
    public final WeakReference f7908a;
    public final Executor f7909b;
    public final u f7910c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.f7910c = uVar;
        this.f7908a = new WeakReference(eVar);
        this.f7909b = executor;
    }
}
