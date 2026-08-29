package a9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class o implements w9.b, w9.a {
    public final HashMap f260a = new HashMap();
    public ArrayDeque f261b = new ArrayDeque();
    public final Executor f262c;

    public o(Executor executor) {
        this.f262c = executor;
    }

    public final void a(f fVar) {
        Executor executor = this.f262c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f260a.containsKey(u8.b.class)) {
                    this.f260a.put(u8.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f260a.get(u8.b.class)).put(fVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
