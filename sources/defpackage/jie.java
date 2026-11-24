package defpackage;

import java.util.concurrent.Future;
public abstract class jie {
    public static Object a(Future future) {
        Object obj;
        boolean z = false;
        if (future.isDone()) {
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        }
        sc8.j(nue.a("Future was expected to be done: %s", future));
        return null;
    }

    public static zl5 b(RuntimeException runtimeException) {
        ?? obj = new Object();
        obj.m(runtimeException);
        return obj;
    }

    public static am5 c(Object obj) {
        if (obj == null) {
            return am5.b;
        }
        return new am5(obj);
    }
}
