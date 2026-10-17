package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f10674a;
    public static final a0.g f10675b;
    public static final Object f10676c;

    static {
        new ArrayDeque();
        f10674a = -100;
        f10675b = new a0.g(0);
        f10676c = new Object();
    }

    public static void c(r rVar) {
        synchronized (f10676c) {
            try {
                a0.g gVar = f10675b;
                gVar.getClass();
                a0.b bVar = new a0.b(gVar);
                while (bVar.hasNext()) {
                    g gVar2 = (g) ((WeakReference) bVar.next()).get();
                    if (gVar2 == rVar || gVar2 == null) {
                        bVar.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void a();

    public abstract boolean d(int i10);
}
