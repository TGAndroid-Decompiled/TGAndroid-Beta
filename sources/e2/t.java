package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class t {
    public final WeakReference f8580a;
    public final Executor f8581b;
    public final u f8582c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.f8582c = uVar;
        this.f8580a = new WeakReference(eVar);
        this.f8581b = executor;
    }
}
