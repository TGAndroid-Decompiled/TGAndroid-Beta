package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
public abstract class g {
    public static final int f10675a;
    public static final a0.g f10676b;
    public static final Object f10677c;

    static {
        new ArrayDeque();
        f10675a = -100;
        f10676b = new a0.g(0);
        f10677c = new Object();
    }

    public static void b(r rVar) {
        synchronized (f10677c) {
            try {
                a0.g gVar = f10676b;
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

    public abstract boolean c(int i10);
}
