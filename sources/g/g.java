package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f6267a;
    public static final a0.g f6268b;
    public static final Object f6269c;

    static {
        new ArrayDeque();
        f6267a = -100;
        f6268b = new a0.g(0);
        f6269c = new Object();
    }

    public static void b(q qVar) {
        synchronized (f6269c) {
            try {
                a0.g gVar = f6268b;
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
