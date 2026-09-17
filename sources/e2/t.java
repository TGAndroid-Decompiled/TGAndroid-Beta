package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class t {
    public final WeakReference f8779a;
    public final Executor f8780b;
    public final u f8781c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.f8781c = uVar;
        this.f8779a = new WeakReference(eVar);
        this.f8780b = executor;
    }
}
