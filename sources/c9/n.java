package c9;

import androidx.emoji2.text.w;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class n implements y9.b, y9.a {
    public final HashMap f2173a = new HashMap();
    public ArrayDeque f2174b = new ArrayDeque();
    public final Executor f2175c;

    public n(Executor executor) {
        this.f2175c = executor;
    }

    public final void a(w wVar) {
        Executor executor = this.f2175c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f2173a.containsKey(w8.b.class)) {
                    this.f2173a.put(w8.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f2173a.get(w8.b.class)).put(wVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
