package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f12989a;
    public static final a0.g f12990b;
    public static final Object f12991c;

    static {
        new ArrayDeque();
        f12989a = -100;
        f12990b = new a0.g(0);
        f12991c = new Object();
    }

    public static void c(s sVar) {
        synchronized (f12991c) {
            try {
                a0.g gVar = f12990b;
                gVar.getClass();
                a0.b bVar = new a0.b(gVar);
                while (bVar.hasNext()) {
                    g gVar2 = (g) ((WeakReference) bVar.next()).get();
                    if (gVar2 == sVar || gVar2 == null) {
                        bVar.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void a();

    public abstract boolean d(int i7);
}
