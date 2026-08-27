package g9;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.t3;

public final class o implements Callable {

    public final int f6826a;

    public final Object f6827b;

    public o(Object obj, int i10) {
        this.f6826a = i10;
        this.f6827b = obj;
    }

    private final Object a() throws Throwable {
        boolean z10;
        String str;
        t3 t3Var = (t3) this.f6827b;
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
            ((g) t3Var.f17473a).i((String) t3Var.f17475c, str);
        }
        return null;
    }

    @Override
    public final Object call() throws Throwable {
        Map mapA;
        switch (this.f6826a) {
            case 0:
                return a();
            default:
                com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) this.f6827b;
                ((AtomicReference) lVar.f4601c).set(null);
                synchronized (lVar) {
                    try {
                        if (((AtomicMarkableReference) lVar.f4600b).isMarked()) {
                            mapA = ((d) ((AtomicMarkableReference) lVar.f4600b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) lVar.f4600b;
                            atomicMarkableReference.set((d) atomicMarkableReference.getReference(), false);
                        } else {
                            mapA = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (mapA != null) {
                    t3 t3Var = (t3) lVar.d;
                    ((g) t3Var.f17473a).g((String) t3Var.f17475c, mapA, lVar.f4599a);
                }
                return null;
        }
    }
}
