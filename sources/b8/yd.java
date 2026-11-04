package b8;

import java.util.concurrent.Future;
public abstract class yd {
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
        throw new IllegalStateException(ac.a("Future was expected to be done: %s", future));
    }

    public static l9.w b(Object obj) {
        if (obj == null) {
            return l9.w.f18167b;
        }
        return new l9.w(obj);
    }

    public static l9.p c(l9.y yVar, f9.k kVar) {
        ?? obj = new Object();
        yVar.getClass();
        obj.f18160n = yVar;
        obj.f18161r = kVar;
        yVar.b(obj, l9.r.f18162a);
        return obj;
    }
}
