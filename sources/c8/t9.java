package c8;

import java.util.concurrent.Future;
public abstract class t9 {
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
        throw new IllegalStateException(a8.ma.a("Future was expected to be done: %s", future));
    }

    public static m9.w b(Object obj) {
        if (obj == null) {
            return m9.w.f20988b;
        }
        return new m9.w(obj);
    }

    public static m9.p c(m9.y yVar, g9.k kVar) {
        ?? obj = new Object();
        yVar.getClass();
        obj.f20981n = yVar;
        obj.f20982r = kVar;
        yVar.b(obj, m9.r.f20983a);
        return obj;
    }
}
