package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f12139a;
    public static final a0.g f12140b;
    public static final Object f12141c;

    static {
        new ArrayDeque();
        f12139a = -100;
        f12140b = new a0.g(0);
        f12141c = new Object();
    }

    public static void b(r rVar) {
        synchronized (f12141c) {
            try {
                a0.g gVar = f12140b;
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
