package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l54 implements jcb, uw8 {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public l54(Executor executor) {
        this.c = executor;
    }

    public final void a(h64 h64Var) {
        Executor executor = this.c;
        synchronized (this) {
            executor.getClass();
            if (!this.a.containsKey(k73.class)) {
                this.a.put(k73.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(k73.class)).put(h64Var, executor);
        }
    }
}
