package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f13018a;
    public static final a0.g f13019b;
    public static final Object f13020c;

    static {
        new ArrayDeque();
        f13018a = -100;
        f13019b = new a0.g(0);
        f13020c = new Object();
    }

    public static void c(s sVar) {
        synchronized (f13020c) {
            try {
                a0.g gVar = f13019b;
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
