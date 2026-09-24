package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class h {
    public static final int f9245a;
    public static final a0.g f9246b;
    public static final Object f9247c;

    static {
        new ArrayDeque();
        f9245a = -100;
        f9246b = new a0.g(0);
        f9247c = new Object();
    }

    public static void b(s sVar) {
        synchronized (f9247c) {
            try {
                a0.g gVar = f9246b;
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
