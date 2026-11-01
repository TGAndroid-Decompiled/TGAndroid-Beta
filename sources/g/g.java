package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f7194a;
    public static final a0.g f7195b;
    public static final Object f7196c;

    static {
        new ArrayDeque();
        f7194a = -100;
        f7195b = new a0.g(0);
        f7196c = new Object();
    }

    public static void b(r rVar) {
        synchronized (f7196c) {
            try {
                a0.g gVar = f7195b;
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
