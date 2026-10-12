package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class t {
    public final WeakReference f8571a;
    public final Executor f8572b;
    public final u f8573c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.f8573c = uVar;
        this.f8571a = new WeakReference(eVar);
        this.f8572b = executor;
    }
}
