package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f6981a;
    public static final a0.g f6982b;
    public static final Object f6983c;

    static {
        new ArrayDeque();
        f6981a = -100;
        f6982b = new a0.g(0);
        f6983c = new Object();
    }

    public static void b(q qVar) {
        synchronized (f6983c) {
            try {
                a0.g gVar = f6982b;
                gVar.getClass();
                a0.b bVar = new a0.b(gVar);
                while (bVar.hasNext()) {
                    g gVar2 = (g) ((WeakReference) bVar.next()).get();
                    if (gVar2 == qVar || gVar2 == null) {
                        bVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract boolean c(int i9);
}
