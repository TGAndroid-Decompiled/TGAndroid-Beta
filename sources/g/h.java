package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class h {
    public static final int f9263a;
    public static final a0.g f9264b;
    public static final Object f9265c;

    static {
        new ArrayDeque();
        f9263a = -100;
        f9264b = new a0.g(0);
        f9265c = new Object();
    }

    public static void b(s sVar) {
        synchronized (f9265c) {
            try {
                a0.g gVar = f9264b;
                gVar.getClass();
                a0.b bVar = new a0.b(gVar);
                while (bVar.hasNext()) {
                    h hVar = (h) ((WeakReference) bVar.next()).get();
                    if (hVar == sVar || hVar == null) {
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
