package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f12672a;
    public static final a0.g f12673b;
    public static final Object f12674c;

    static {
        new ArrayDeque();
        f12672a = -100;
        f12673b = new a0.g(0);
        f12674c = new Object();
    }

    public static void b(s sVar) {
        synchronized (f12674c) {
            try {
                a0.g gVar = f12673b;
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
