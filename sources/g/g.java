package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f10132a;
    public static final a0.g f10133b;
    public static final Object f10134c;

    static {
        new ArrayDeque();
        f10132a = -100;
        f10133b = new a0.g(0);
        f10134c = new Object();
    }

    public static void b(r rVar) {
        synchronized (f10134c) {
            try {
                a0.g gVar = f10133b;
                gVar.getClass();
                a0.b bVar = new a0.b(gVar);
                while (bVar.hasNext()) {
                    g gVar2 = (g) ((WeakReference) bVar.next()).get();
                    if (gVar2 == rVar || gVar2 == null) {
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
