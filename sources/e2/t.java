package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class t {
    public final WeakReference f7909a;
    public final Executor f7910b;
    public final u f7911c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.f7911c = uVar;
        this.f7909a = new WeakReference(eVar);
        this.f7910b = executor;
    }
}
