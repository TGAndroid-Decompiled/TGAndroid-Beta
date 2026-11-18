package ca;

import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.o3;
public final class r implements Runnable {
    public final int f5143a;
    public final Object f5144b;

    public r(Object obj, int i7) {
        this.f5143a = i7;
        this.f5144b = obj;
    }

    private final void a() {
        ab.q qVar = (ab.q) this.f5144b;
        Map map = null;
        ((AtomicReference) qVar.f989c).set(null);
        synchronized (qVar) {
            try {
                if (((AtomicMarkableReference) qVar.f988b).isMarked()) {
                    map = ((e) ((AtomicMarkableReference) qVar.f988b).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) qVar.f988b;
                    atomicMarkableReference.set((e) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (map != null) {
            o3 o3Var = (o3) qVar.d;
            ((h) o3Var.f20158a).h((String) o3Var.f20160c, map, qVar.f987a);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ca.r.run():void");
    }
}
