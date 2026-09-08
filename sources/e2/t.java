package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class t {
    public final WeakReference f8807a;
    public final Executor f8808b;
    public final u f8809c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.f8809c = uVar;
        this.f8807a = new WeakReference(eVar);
        this.f8808b = executor;
    }
}
