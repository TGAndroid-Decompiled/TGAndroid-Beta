package c9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class o implements y9.b, y9.a {
    public final HashMap f2197a = new HashMap();
    public ArrayDeque f2198b = new ArrayDeque();
    public final Executor f2199c;

    public o(Executor executor) {
        this.f2199c = executor;
    }

    public final void a(af.a aVar) {
        Executor executor = this.f2199c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f2197a.containsKey(w8.b.class)) {
                    this.f2197a.put(w8.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f2197a.get(w8.b.class)).put(aVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
