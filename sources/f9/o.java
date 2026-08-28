package f9;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.t3;
public final class o implements Callable {
    public final int f6026a;
    public final Object f6027b;

    public o(Object obj, int i9) {
        this.f6026a = i9;
        this.f6027b = obj;
    }

    private final Object a() {
        boolean z10;
        String str;
        t3 t3Var = (t3) this.f6027b;
        synchronized (((AtomicMarkableReference) t3Var.h)) {
            try {
                z10 = false;
                if (((AtomicMarkableReference) t3Var.h).isMarked()) {
                    str = (String) ((AtomicMarkableReference) t3Var.h).getReference();
                    ((AtomicMarkableReference) t3Var.h).set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            ((g) t3Var.f17098a).i((String) t3Var.f17100c, str);
        }
        return null;
    }

    @Override
    public final Object call() {
        Map map;
        switch (this.f6026a) {
            case 0:
                return a();
            default:
                com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) this.f6027b;
                ((AtomicReference) lVar.f4159c).set(null);
                synchronized (lVar) {
                    try {
                        if (((AtomicMarkableReference) lVar.f4158b).isMarked()) {
                            map = ((d) ((AtomicMarkableReference) lVar.f4158b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) lVar.f4158b;
                            atomicMarkableReference.set((d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (map != null) {
                    t3 t3Var = (t3) lVar.d;
                    ((g) t3Var.f17098a).g((String) t3Var.f17100c, map, lVar.f4157a);
                }
                return null;
        }
    }
}
