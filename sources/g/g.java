package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f13015a;
    public static final a0.g f13016b;
    public static final Object f13017c;

    static {
        new ArrayDeque();
        f13015a = -100;
        f13016b = new a0.g(0);
        f13017c = new Object();
    }

    public static void c(s sVar) {
        synchronized (f13017c) {
            try {
                a0.g gVar = f13016b;
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
