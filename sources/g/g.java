package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f13324a;
    public static final a0.g f13325b;
    public static final Object f13326c;

    static {
        new ArrayDeque();
        f13324a = -100;
        f13325b = new a0.g(0);
        f13326c = new Object();
    }

    public static void b(s sVar) {
        synchronized (f13326c) {
            try {
                a0.g gVar = f13325b;
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

    public abstract boolean c(int i7);
}
