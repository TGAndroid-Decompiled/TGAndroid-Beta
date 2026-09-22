package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class t {
    public final WeakReference f7923a;
    public final Executor f7924b;
    public final u f7925c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.f7925c = uVar;
        this.f7923a = new WeakReference(eVar);
        this.f7924b = executor;
    }
}
