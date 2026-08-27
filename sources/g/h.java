package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

public abstract class h {

    public static final int f6262a;

    public static final a0.g f6263b;

    public static final Object f6264c;

    static {
        new ArrayDeque();
        f6262a = -100;
        f6263b = new a0.g(0);
        f6264c = new Object();
    }

    public static void b(r rVar) {
        synchronized (f6264c) {
            try {
                a0.g gVar = f6263b;
                gVar.getClass();
                a0.b bVar = new a0.b(gVar);
                while (bVar.hasNext()) {
                    h hVar = (h) ((WeakReference) bVar.next()).get();
                    if (hVar == rVar || hVar == null) {
                        bVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract boolean c(int i10);
}
