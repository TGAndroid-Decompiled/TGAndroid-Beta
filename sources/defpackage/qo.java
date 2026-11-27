package defpackage;

import java.lang.ref.WeakReference;
public abstract class qo {
    public static final int a = -100;
    public static final ss b = new ss(0);
    public static final Object c = new Object();

    public static void b(cp cpVar) {
        synchronized (c) {
            ss ssVar = b;
            ssVar.getClass();
            ns nsVar = new ns(ssVar);
            while (nsVar.hasNext()) {
                qo qoVar = (qo) ((WeakReference) nsVar.next()).get();
                if (qoVar == cpVar || qoVar == null) {
                    nsVar.remove();
                }
            }
        }
    }

    public abstract void a();

    public abstract boolean c(int i);
}
