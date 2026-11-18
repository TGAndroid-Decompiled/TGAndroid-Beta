package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f12986a;
    public static final a0.g f12987b;
    public static final Object f12988c;

    static {
        new ArrayDeque();
        f12986a = -100;
        f12987b = new a0.g(0);
        f12988c = new Object();
    }

    public static void c(s sVar) {
        synchronized (f12988c) {
            try {
                a0.g gVar = f12987b;
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
