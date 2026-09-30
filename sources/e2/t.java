package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class t {
    public final WeakReference f7920a;
    public final Executor f7921b;
    public final u f7922c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.f7922c = uVar;
        this.f7920a = new WeakReference(eVar);
        this.f7921b = executor;
    }
}
