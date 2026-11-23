package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f12981a;
    public static final a0.g f12982b;
    public static final Object f12983c;

    static {
        new ArrayDeque();
        f12981a = -100;
        f12982b = new a0.g(0);
        f12983c = new Object();
    }

    public static void c(s sVar) {
        synchronized (f12983c) {
            try {
                a0.g gVar = f12982b;
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

    public abstract boolean d(int i7);
}
