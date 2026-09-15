package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class t {
    public final WeakReference f7921a;
    public final Executor f7922b;
    public final u f7923c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.f7923c = uVar;
        this.f7921a = new WeakReference(eVar);
        this.f7922b = executor;
    }
}
