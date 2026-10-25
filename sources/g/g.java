package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f12140a;
    public static final a0.g f12141b;
    public static final Object f12142c;

    static {
        new ArrayDeque();
        f12140a = -100;
        f12141b = new a0.g(0);
        f12142c = new Object();
    }

    public static void b(r rVar) {
        synchronized (f12142c) {
            try {
                a0.g gVar = f12141b;
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
