package c9;

import androidx.emoji2.text.w;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class n implements y9.b, y9.a {
    public final HashMap f2363a = new HashMap();
    public ArrayDeque f2364b = new ArrayDeque();
    public final Executor f2365c;

    public n(Executor executor) {
        this.f2365c = executor;
    }

    public final void a(w wVar) {
        Executor executor = this.f2365c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f2363a.containsKey(w8.b.class)) {
                    this.f2363a.put(w8.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f2363a.get(w8.b.class)).put(wVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
