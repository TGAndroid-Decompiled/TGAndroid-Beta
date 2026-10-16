package b5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.t3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
public final class g implements Callable {
    public final int f2591a;
    public final Object f2592b;

    public g(Object obj, int i10) {
        this.f2591a = i10;
        this.f2592b = obj;
    }

    private final Object a() {
        boolean z10;
        String str;
        t3 t3Var = (t3) this.f2592b;
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ((y9.f) t3Var.f14983a).i((String) t3Var.f14985c, str);
        }
        return null;
    }

    @Override
    public final Object call() {
        Map map;
        switch (this.f2591a) {
            case 0:
                return new h((JsReplyProxyBoundaryInterface) this.f2592b);
            case 1:
                return a();
            default:
                c2.b bVar = (c2.b) this.f2592b;
                ((AtomicReference) bVar.f4124c).set(null);
                synchronized (bVar) {
                    try {
                        if (((AtomicMarkableReference) bVar.f4123b).isMarked()) {
                            map = ((y9.d) ((AtomicMarkableReference) bVar.f4123b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) bVar.f4123b;
                            atomicMarkableReference.set((y9.d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (map != null) {
                    t3 t3Var = (t3) bVar.d;
                    ((y9.f) t3Var.f14983a).g((String) t3Var.f14985c, map, bVar.f4122a);
                }
                return null;
        }
    }
}
