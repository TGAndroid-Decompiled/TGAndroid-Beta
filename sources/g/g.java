package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f11706a;
    public static final a0.g f11707b;
    public static final Object f11708c;

    static {
        new ArrayDeque();
        f11706a = -100;
        f11707b = new a0.g(0);
        f11708c = new Object();
    }

    public static void c(s sVar) {
        synchronized (f11708c) {
            try {
                a0.g gVar = f11707b;
                gVar.getClass();
                a0.b bVar = new a0.b(gVar);
                while (bVar.hasNext()) {
                    g gVar2 = (g) ((WeakReference) bVar.next()).get();
                    if (gVar2 == sVar || gVar2 == null) {
                        bVar.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void a();

    public abstract boolean d(int i3);
}
