package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class h {
    public static final int f8391a;
    public static final a0.g f8392b;
    public static final Object f8393c;

    static {
        new ArrayDeque();
        f8391a = -100;
        f8392b = new a0.g(0);
        f8393c = new Object();
    }

    public static void b(s sVar) {
        synchronized (f8393c) {
            try {
                a0.g gVar = f8392b;
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
