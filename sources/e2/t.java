package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class t {
    public final WeakReference f7925a;
    public final Executor f7926b;
    public final u f7927c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.f7927c = uVar;
        this.f7925a = new WeakReference(eVar);
        this.f7926b = executor;
    }
}
