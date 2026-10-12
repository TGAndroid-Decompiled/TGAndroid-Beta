package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f9765a;
    public static final a0.g f9766b;
    public static final Object f9767c;

    static {
        new ArrayDeque();
        f9765a = -100;
        f9766b = new a0.g(0);
        f9767c = new Object();
    }

    public static void b(r rVar) {
        synchronized (f9767c) {
            try {
                a0.g gVar = f9766b;
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
