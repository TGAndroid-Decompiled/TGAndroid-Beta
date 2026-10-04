package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class t {
    public final WeakReference f8579a;
    public final Executor f8580b;
    public final u f8581c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.f8581c = uVar;
        this.f8579a = new WeakReference(eVar);
        this.f8580b = executor;
    }
}
