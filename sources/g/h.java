package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class h {
    public static final int f10228a;
    public static final a0.g f10229b;
    public static final Object f10230c;

    static {
        new ArrayDeque();
        f10228a = -100;
        f10229b = new a0.g(0);
        f10230c = new Object();
    }

    public static void b(s sVar) {
        synchronized (f10230c) {
            try {
                a0.g gVar = f10229b;
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
