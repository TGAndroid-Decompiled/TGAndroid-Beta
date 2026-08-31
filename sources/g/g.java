package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f6734a;
    public static final a0.g f6735b;
    public static final Object f6736c;

    static {
        new ArrayDeque();
        f6734a = -100;
        f6735b = new a0.g(0);
        f6736c = new Object();
    }

    public static void b(q qVar) {
        synchronized (f6736c) {
            try {
                a0.g gVar = f6735b;
                gVar.getClass();
                a0.b bVar = new a0.b(gVar);
                while (bVar.hasNext()) {
                    g gVar2 = (g) ((WeakReference) bVar.next()).get();
                    if (gVar2 == qVar || gVar2 == null) {
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
