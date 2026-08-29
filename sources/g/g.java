package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f6891a;
    public static final a0.g f6892b;
    public static final Object f6893c;

    static {
        new ArrayDeque();
        f6891a = -100;
        f6892b = new a0.g(0);
        f6893c = new Object();
    }

    public static void b(q qVar) {
        synchronized (f6893c) {
            try {
                a0.g gVar = f6892b;
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
