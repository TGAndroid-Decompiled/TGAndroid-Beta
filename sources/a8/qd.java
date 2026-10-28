package a8;

import java.util.concurrent.Future;
public abstract class qd {
    public static Object a(Future future) {
        Object obj;
        boolean z10 = false;
        if (future.isDone()) {
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return obj;
        }
        throw new IllegalStateException(zb.a("Future was expected to be done: %s", future));
    }

    public static k9.w b(Object obj) {
        if (obj == null) {
            return k9.w.f16495b;
        }
        return new k9.w(obj);
    }

    public static k9.p c(k9.y yVar, e9.k kVar) {
        ?? obj = new Object();
        yVar.getClass();
        obj.f16488n = yVar;
        obj.f16489r = kVar;
        yVar.a(obj, k9.r.f16490a);
        return obj;
    }
}
