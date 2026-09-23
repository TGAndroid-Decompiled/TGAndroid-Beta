package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class h {
    public static final int f9246a;
    public static final a0.g f9247b;
    public static final Object f9248c;

    static {
        new ArrayDeque();
        f9246a = -100;
        f9247b = new a0.g(0);
        f9248c = new Object();
    }

    public static void b(s sVar) {
        synchronized (f9248c) {
            try {
                a0.g gVar = f9247b;
                gVar.getClass();
                a0.b bVar = new a0.b(gVar);
                while (bVar.hasNext()) {
                    h hVar = (h) ((WeakReference) bVar.next()).get();
                    if (hVar == sVar || hVar == null) {
                        bVar.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void a();

    public abstract boolean c(int i10);
}
