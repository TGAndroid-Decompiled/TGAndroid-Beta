package defpackage;

import java.lang.ref.WeakReference;
public abstract class po {
    public static final int a = -100;
    public static final rs b = new rs(0);
    public static final Object c = new Object();

    public static void b(bp bpVar) {
        synchronized (c) {
            rs rsVar = b;
            rsVar.getClass();
            ms msVar = new ms(rsVar);
            while (msVar.hasNext()) {
                po poVar = (po) ((WeakReference) msVar.next()).get();
                if (poVar == bpVar || poVar == null) {
                    msVar.remove();
                }
            }
        }
    }

    public abstract void a();

    public abstract boolean c(int i);
}
