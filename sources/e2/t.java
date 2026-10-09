package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class t {
    public final WeakReference f8574a;
    public final Executor f8575b;
    public final u f8576c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.f8576c = uVar;
        this.f8574a = new WeakReference(eVar);
        this.f8575b = executor;
    }
}
