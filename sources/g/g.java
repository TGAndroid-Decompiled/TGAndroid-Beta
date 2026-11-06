package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f13322a;
    public static final a0.g f13323b;
    public static final Object f13324c;

    static {
        new ArrayDeque();
        f13322a = -100;
        f13323b = new a0.g(0);
        f13324c = new Object();
    }

    public static void b(s sVar) {
        synchronized (f13324c) {
            try {
                a0.g gVar = f13323b;
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
